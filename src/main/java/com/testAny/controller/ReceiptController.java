package com.testAny.controller;

import com.testAny.dto.SaveReceiptDto;
import com.testAny.searvice.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/receipt")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptService receiptService;

    @PostMapping("/save")
    public DefaultResponse saveReceipt(@RequestBody SaveReceiptDto saveReceiptDto) {

        Long aLong = receiptService.saveReceipt(saveReceiptDto);

        if(aLong == null) {
            throw new RuntimeException();
        }

        return new DefaultResponse();
    }
}
