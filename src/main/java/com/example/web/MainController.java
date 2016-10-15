package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Fernando Teran on 10/15/2016.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody public String root(){
        return "Hello World Fer";
    }
}
