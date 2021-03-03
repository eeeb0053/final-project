package com.example.demo.cmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @GetMapping("/")
    public String index() {
        logger.info("Project Initialized ... ");
        return "index";
    }

    @GetMapping("/move/{dir}/{page}") 
    public String move(@PathVariable String dir, 
    						@PathVariable String page) {
        logger.info("이동 디렉토리: " + dir);
        logger.info("이동 파일: " + page);
        return String.format("%s/%s", dir, page);
    }
}