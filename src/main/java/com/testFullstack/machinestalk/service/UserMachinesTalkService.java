package com.testFullstack.machinestalk.service;


import com.testFullstack.machinestalk.model.UserMachinesTalk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserMachinesTalkService {


    @Autowired
    private RestTemplate template= new RestTemplate();

    public UserMachinesTalk[] findAllUsers(){
        return template.getForObject("https://gorest.co.in/public/v2/users",UserMachinesTalk[].class );
    }
}
