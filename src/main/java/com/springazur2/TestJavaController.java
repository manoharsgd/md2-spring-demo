package com.springazur2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJavaController {

    @RequestMapping("/message")
    public String getMessage()
    {
        return "Wel Come to Spring Boot Azur.......";
    }
}
