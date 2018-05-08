package com.project02.main.dao;

import com.project02.main.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.management.relation.Role;
import java.util.Collections;

public interface RoleRepository extends CrudRepository<Roles,Long> {

    Roles findByRole(@Param("role") String roleName);

}