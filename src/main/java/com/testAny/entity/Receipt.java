package com.testAny.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "receipt_ID")
    private Long id;

    @Column(name = "orderId")
    private String orderId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "receiptUrl")
    private String receiptUrl;

    @Column(name = "paymentState")
    @Comment("Y = 성공, N = 실패, W = 대기")
    private String paymentState;

}
