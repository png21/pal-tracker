package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    /*String message;

    public WelcomeController(@value()String message)
    {
        this.message=message;
    }*/


    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }
}