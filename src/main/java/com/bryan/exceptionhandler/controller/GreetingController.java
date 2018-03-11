package com.bryan.exceptionhandler.controller;

import com.bryan.exceptionhandler.exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value="/greetings",method = RequestMethod.GET)
    public ResponseEntity<Object> getGreeting() throws CustomException {
        throw new CustomException();
    }

}
