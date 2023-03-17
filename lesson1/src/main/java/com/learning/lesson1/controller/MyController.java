package com.learning.lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class MyController {
    // Eğer @GetMapping(path = "/message/{message}") şeklinde ise yani parametre
    // ile aynı isimde olursa @PathVariable("m") içindeki ("m") ibaresine gerek yok
    @GetMapping({"/message","/message/{message}"})
    public String getMyMessage(@PathVariable(name = "message",required = false) String message){
        return ("Your message is : "+message);
    }

    @GetMapping(path="/paramMessage")
    public String getMessage(@RequestParam(name = "message",required = false,defaultValue = "my default value") String message){
        return ("Your message is : "+message);
    }
}

