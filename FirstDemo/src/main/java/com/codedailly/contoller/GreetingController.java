package com.codedailly.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/morning")
    public String getMorningGreeting() {
        return "Good Morning";
    }

    @GetMapping("/evening")
    public String getEveningGreeting() {
        return "Good Evening";
    }

    @GetMapping("/night")
    public String getNightGreeting() {
        return "Good Night";
    }

}
