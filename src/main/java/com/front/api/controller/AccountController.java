package com.front.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wei yong
 **/
@RestController
public class AccountController {

    @GetMapping(value = "/test")
    public String test(){
        return "12222";
    }
}
