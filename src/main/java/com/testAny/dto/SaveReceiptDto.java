package com.testAny.dto;

import com.testAny.entity.Receipt;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class SaveReceiptDto {

    private String orderId;

    private String productName;

    private String paymentType;

    private String receiptUrl;

    public Receipt toEntity() {
        return Receipt.builder()
                .orderId(orderId)
                .productName(productName)
                .paymentType(paymentType)
                .receiptUrl(receiptUrl)
                .paymentState("W")
                .build();
    }
}
