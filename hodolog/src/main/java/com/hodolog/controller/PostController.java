package com.hodolog.controller;

import com.hodolog.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class PostController {

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params) {
        log.info("params={}", params.toString());
        return "Hello World";
    }
}
