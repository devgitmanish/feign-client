package com.feignclient.controller;


import com.feignclient.model.Books;
import com.feignclient.utils.FeignCalls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private FeignCalls feignCalls;

    @GetMapping("/voice")
    public String getAnimalsVoice(){
        return feignCalls.animalCharacterstatics();
    }

    @GetMapping("/books")
    public List<Books> getBooks(){
        return feignCalls.getBooks();
    }
}
