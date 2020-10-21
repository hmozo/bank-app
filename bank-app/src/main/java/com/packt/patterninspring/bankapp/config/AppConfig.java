package com.packt.patterninspring.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.packt.patterninspring.bankapp.repository.AccountRepository;
import com.packt.patterninspring.bankapp.repository.JdbcAccountRepository;
import com.packt.patterninspring.bankapp.repository.JdbcTransferRepository;
import com.packt.patterninspring.bankapp.repository.TransferRepository;
import com.packt.patterninspring.bankapp.service.TransferService;
import com.packt.patterninspring.bankapp.service.TransferServiceImpl;

@Configuration
@ComponentScan(basePackages = {"com.packt.patterninspring.bankapp.service", 
		"com.packt.patterninspring.bankapp.repository"})
public class AppConfig {

	/*@Bean
	public TransferService transferService(AccountRepository accountRepository,
			TransferRepository transferRepository) {
		return new TransferServiceImpl(accountRepository, transferRepository);
	}
	
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}
	
	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}*/
	
	
}
