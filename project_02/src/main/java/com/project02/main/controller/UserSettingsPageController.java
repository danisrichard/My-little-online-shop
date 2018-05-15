package com.project02.main.controller;

import com.project02.main.service.UserSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserSettingsPageController {

    @Autowired
    private UserSettingsService userSettingsService;

    @GetMapping("/usersettings")
    public String userSettingPage(){

        return null;
    }
}
