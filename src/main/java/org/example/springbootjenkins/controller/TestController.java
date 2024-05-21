package org.example.springbootjenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return  new ResponseEntity<>("welcome to example of jenkins with spring boot", HttpStatus.OK);
    }
}
