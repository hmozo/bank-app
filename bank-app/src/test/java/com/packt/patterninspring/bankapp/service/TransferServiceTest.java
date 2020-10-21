package com.packt.patterninspring.bankapp.service;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.packt.patterninspring.bankapp.config.AppConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= AppConfig.class)
public class TransferServiceTest {

	@Autowired
	TransferService transferService;
	
	@Test
	void transferServiceNotNull() {
		assertNotNull(transferService);
	}
	
	@Test
	void transferAmountOK() {
		Long accountA= 123L;
		Long accountB= 456L;
		Long amount= 254L;
		transferService.transferAmount(accountA, accountB, amount);
	}
	
}
