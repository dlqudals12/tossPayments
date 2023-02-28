import React, {useEffect} from "react";
import {useLocation} from "react-router-dom";
import axios from "axios";

export const Success = () => {
    const location = useLocation();

    console.log(location);

    const params = new URLSearchParams(location.search);

    console.log(window.btoa('test_sk_OEP59LybZ8B065mkE1WV6GYo7pRe:'));

    useEffect(() => {
        axios.post(
            'https://api.tosspayments.com/v1/payments/confirm', {
                paymentKey: params.get('paymentKey'),
                orderId: params.get('orderId'),
                amount: params.get('amount')
            }, {
                headers: { Authorization: `Basic ${window.btoa('test_sk_OEP59LybZ8B065mkE1WV6GYo7pRe:')}` },
            }
        ).then(res => {
            console.log(res);
        })
        /*
        axios.get(
            'https://api.tosspayments.com/v1/payments/orders/' + params.get('orderId'), {
                headers: { Authorization: `Basic ${window.btoa('test_sk_OEP59LybZ8B065mkE1WV6GYo7pRe:')}` },
            }
        ).then(res => {
            console.log(res);
        })

         */
    }, []);

    return (
        <></>
    )
}