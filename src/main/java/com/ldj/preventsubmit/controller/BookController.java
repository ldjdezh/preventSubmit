package com.ldj.preventsubmit.controller;

import com.ldj.preventsubmit.annotation.LocalLock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class BookController {

    @LocalLock(key = "city:arg[0]")
    @GetMapping
    public String query(@RequestParam String token) {
        return "ok= " + token;
    }
}
