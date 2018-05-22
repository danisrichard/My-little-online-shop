package com.project02.main.controller;

import com.project02.main.entity.User;
import com.project02.main.service.UserSettingsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@Controller
public class UserSettingsPageController {

    private static final Logger logger = LogManager.getLogger(UserSettingsPageController.class);

    @Autowired
    private UserSettingsService userSettingsService;

    @GetMapping("/usersettings")
    public String userSettingPage( User user,Model model){

        model.addAttribute("user",user);

        logger.info("Username: " + user.getName());

        return "user-settings-section/user-settings-page";
    }
}
