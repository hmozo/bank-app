package com.packt.patterninspring.bankapp.repository;

import com.packt.patterninspring.bankapp.model.Account;

public interface TransferRepository {

		void transfer(Account accountA, Account accountB, Long amount);
}
