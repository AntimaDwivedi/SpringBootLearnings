package com.learning.spring.controller;

import com.learning.spring.bean.CurrencyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfiguartionController {


    @Autowired
    private CurrencyConfiguration currencyConfiguration;

    @RequestMapping("/currency-configuration")
    public CurrencyConfiguration configuation(){

        return currencyConfiguration;



    }
}
