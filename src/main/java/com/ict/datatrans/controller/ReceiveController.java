package com.ict.datatrans.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReceiveController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }
}