package com.packt.patterninspring.bankapp.repository;

import org.springframework.stereotype.Repository;

import com.packt.patterninspring.bankapp.model.Account;

@Repository
public class JdbcTransferRepository implements TransferRepository{

	@Override
	public void transfer(Account accountA, Account accountB, Long amount) {
		System.out.println("Transferring amount from account A to B via JDBC implementation");
	}

}
