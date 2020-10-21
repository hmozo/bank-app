package com.packt.patterninspring.bankapp.repository;

import com.packt.patterninspring.bankapp.model.Account;

public interface AccountRepository {

	Account findByAccountId(Long accountId);
}
