package com.project02.main.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.sql.DataSource;

/**
 * HTTPSecurity configurer
 * - roles ADMIN allow to access /admin/**
 * - roles USER allow to access /user/** and /newPost/**
 * - anybody can visit /, /home, /about, /registration, /error, /blog/**, /post/**, /h2-console/**
 * - every other page needs authentication
 * - custom 403 access denied handler
 */

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LogManager.getLogger(SpringSecurityConfig.class);

    // idk how it work 100%

    private final AccessDeniedHandler accessDeniedHandler;

    @Value("${admin.username}")
    private String adminUsername;

    @Value("${admin.username}")
    private String adminPassword;

    @Value("${queries.users-query}")
    private String usersQuery;

    @Value("${queries.roles-query}")
    private String rolesQuery;

    final DataSource dataSource;

    @Autowired
    public SpringSecurityConfig(AccessDeniedHandler accessDeniedHandler,DataSource dataSource){
        this.dataSource = dataSource;
        this.accessDeniedHandler = accessDeniedHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/index", "/registration", "/error" ).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/index")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler)
                .and().headers().frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        //db autho
        auth.
                jdbcAuthentication()
                .usersByUsernameQuery(usersQuery)
                .authoritiesByUsernameQuery(rolesQuery)
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder());

        logger.info("userQuery" + usersQuery + " - rolesQuery " + rolesQuery);

        //memo autho
        auth.inMemoryAuthentication()
                .withUser(adminUsername).password(adminPassword).roles("ADMIN");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
