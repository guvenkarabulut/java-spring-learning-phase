package com.katmanl.mimari.katmanliMimariDeneme.controller;

import com.katmanl.mimari.katmanliMimariDeneme.service.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path="/api")
public class ReaderController {
    @Autowired
    @Qualifier("EXCEL")
    private Reader reader;
    @GetMapping(path="/read")
    public String read(){
        return this.reader.readFile();
    }
}
