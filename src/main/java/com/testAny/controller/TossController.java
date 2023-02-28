package com.testAny.controller;

import com.testAny.dto.BillingDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toss")
public class TossController {

    @PostMapping("/billing")
    public DefaultResponse billing(@RequestBody BillingDto billingDto) {

        System.out.println(billingDto);

        return new DefaultResponse();
    }
}
