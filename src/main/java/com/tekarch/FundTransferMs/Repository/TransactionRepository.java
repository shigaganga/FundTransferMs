package com.tekarch.FundTransferMs.Repository;
import com.tekarch.FundTransferMs.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}
