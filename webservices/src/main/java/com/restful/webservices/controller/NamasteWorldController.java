package com.restful.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamasteWorldController {

    @GetMapping(path = "/namaste-world")
    public String namasteworld(){
        return "Namaste-World !!";

    }
}
