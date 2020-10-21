package com.packt.patterninspring.bankapp.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.packt.patterninspring.bankapp.model.Account;

@Repository
@Qualifier("jpaAccountRepository")
public class JpaAccountRepository implements AccountRepository{

	@Override
	public Account findByAccountId(Long accountId) {

		return new Account(accountId, null, null);
	}
	
}
