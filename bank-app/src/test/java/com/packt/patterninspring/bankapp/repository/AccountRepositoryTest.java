package com.packt.patterninspring.bankapp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.packt.patterninspring.bankapp.config.AppConfig;
import com.packt.patterninspring.bankapp.model.Account;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= AppConfig.class)
public class AccountRepositoryTest {
	
	@Autowired
	@Qualifier("jdbcAccountRepository")
	AccountRepository accountRepository;
	
	@Test
	void findByAccountIdOk() {
		Account account= accountRepository.findByAccountId(123L);
		assertThat(account.getName()).isEqualTo("Arnav Rajput");
	}

}
