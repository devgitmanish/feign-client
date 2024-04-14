package com.feignclient.utils;

import com.feignclient.model.Books;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@FeignClient(value = "feign", url = "${url}")
public interface FeignCalls {

    /*${url}/animal
    this is third party/another url that you want to hit
    http://localhost:port/animal

    */

    @GetMapping("/animal")
    public String animalCharacterstatics();

    /*
    ${url}/animal
    this is third party/another url that you want to hit
    http://localhost:port/books
    */
    @GetMapping("/books")
    public List<Books> getBooks();

}
