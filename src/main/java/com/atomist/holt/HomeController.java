// You are the delta in what you do, not the things you did in the past

package com.atomist.holt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
}
