package org.crazyman.controller;

import lombok.AllArgsConstructor;
import org.crazyman.service.AService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    private AService aService;

    @GetMapping
    public String test(){
        return aService.getString();
    }
}
