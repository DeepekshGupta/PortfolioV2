package com.DeepekshGupta.Portfolio.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "new String(param)";
    }
    

    @GetMapping("/name")
    public String getMethodName(@RequestParam String param) {
        return new String(param);
    }
    

}
