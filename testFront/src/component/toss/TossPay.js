import React from "react";
import { loadTossPayments } from "@tosspayments/payment-sdk";
import { v4 as uuidv4 } from "uuid";

const clientKey = "test_ck_7DLJOpm5QrlJLlY4dxo3PNdxbWnY";

export const TossPay = () => {
  const tossPayment = async () => {
    const uuid = uuidv4();

    const tossPayments = await loadTossPayments(clientKey);
    tossPayments.requestPayment("가상계좌", {
      amount: 15000,
      orderId: uuid,
      orderName: "토스 티셔츠 외 2건",
      customerName: "박토스",
      successUrl: "http://localhost:3000/success",
      failUrl: "http://localhost:3000/fail",
      validHours: 24,
      cashReceipt: {
        type: "소득공제",
      },
    });
  };

  const payment = () => {};

  return (
    <>
      <button onClick={tossPayment}>toss</button>
    </>
  );
};
