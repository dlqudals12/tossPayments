package com.testAny.dto;

import lombok.Data;

@Data
public class BillingDto {

    private String createAt;
    private String secret;
    private String status;
    private String transactionKey;
    private String orderId;
}
