package com.testFullstack.machinestalk.controller;


import com.testFullstack.machinestalk.model.UserMachinesTalk;
import com.testFullstack.machinestalk.service.UserMachinesTalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UserMachinesTalkService userMachinesTalkService;


    @GetMapping
    public UserMachinesTalk[] findAllUsers(){
        return userMachinesTalkService.findAllUsers();
    }

}
