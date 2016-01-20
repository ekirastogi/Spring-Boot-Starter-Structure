package com.ekiras.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekansh
 * @since 20/1/16
 */
@RestController
@RequestMapping(value = "")
public class HomeController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
