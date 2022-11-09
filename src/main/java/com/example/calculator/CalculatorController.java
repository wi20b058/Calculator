package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {



    //or getMapping
    @RequestMapping("/api/add")
    public int add (@RequestParam int a, @RequestParam int b){

        return a+b;
    }
    @RequestMapping("/api/multiply")
    public int multiply (@RequestParam int a, @RequestParam int b){

        return a*b;
    }

}

