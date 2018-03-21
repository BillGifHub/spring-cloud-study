package org.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.feign.DcFeignClient;

@RestController
public class DcController {

    @Autowired
    DcFeignClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}