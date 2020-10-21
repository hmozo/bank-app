package com.packt.patterninspring.bankapp.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.packt.patterninspring.bankapp.model.Account;
import com.packt.patterninspring.bankapp.model.Amount;

@Repository
@Qualifier("jdbcAccountRepository")
public class JdbcAccountRepository implements AccountRepository{

	@Override
	public Account findByAccountId(Long accountId) {
		
		return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
	}

}
