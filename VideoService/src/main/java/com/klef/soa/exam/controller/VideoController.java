package com.klef.soa.exam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    

    @GetMapping("/")
    public String home() {
        return "Video Service running on port: ";
    }

    @GetMapping("/list")
    public String list() {
        return "List of videos from VIDEO-SERVICE";
    }
}
