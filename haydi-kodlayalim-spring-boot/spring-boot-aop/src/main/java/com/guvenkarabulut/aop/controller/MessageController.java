package com.guvenkarabulut.aop.controller;

import com.guvenkarabulut.aop.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    @GetMapping
    public ResponseEntity<String> listele(@RequestBody String message){
        return ResponseEntity.ok(messageService.getMessage(message));
    }
}
