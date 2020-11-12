package com.Luqmaan.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }
    @GetMapping("/work")
    public String getDailyWorkout(){
        return "Run 5k hard";
    }

    //Team Details
    @GetMapping("/details")
    public String teamDetails(){
        return "Coach Name: " + coachName + " \n"  + "Team Name: " + teamName;
    }

}
