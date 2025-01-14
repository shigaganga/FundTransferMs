package com.tekarch.FundTransferMs.Services.Interface;

import com.tekarch.FundTransferMs.model.Transactions;
import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transactions transferFunds(Transactions fundTransfer);
    List<Transactions> getAllTransactions();
    Optional<Transactions> getTransactionById(Long transactionId);
}