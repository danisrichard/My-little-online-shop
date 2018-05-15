package com.project02.main.controller;

import com.project02.main.service.UserSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserSettingsPageController {

    @Autowired
    UserSettingsService userSettingsService;
}
