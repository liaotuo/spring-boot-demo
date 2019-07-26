package com.liaotuo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloFluxController {
    @GetMapping("/hello")
    public Mono<String> hello() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Mono.just("Welcome to reactive world ~");
    }
}
