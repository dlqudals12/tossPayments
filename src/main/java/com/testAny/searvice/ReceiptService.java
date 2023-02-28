package com.testAny.searvice;

import com.testAny.dto.SaveReceiptDto;
import com.testAny.entity.Receipt;
import com.testAny.repository.ReceiptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceiptService {

    private final ReceiptRepository receiptRepository;

    public Long saveReceipt(SaveReceiptDto saveReceiptDto) {

        return receiptRepository.save(saveReceiptDto.toEntity()).getId();
    }
}
