package com.packt.patterninspring.bankapp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.packt.patterninspring.bankapp.model.Account;
import com.packt.patterninspring.bankapp.repository.AccountRepository;
import com.packt.patterninspring.bankapp.repository.TransferRepository;

@Service
public class TransferServiceImpl implements TransferService{

	private final AccountRepository accountRepository;
	private final TransferRepository transferRepository;
	
	public TransferServiceImpl(@Qualifier("jdbcAccountRepository") AccountRepository accountRepository, TransferRepository transferRepository) {
		this.accountRepository= accountRepository;
		this.transferRepository= transferRepository;
	}
	
	@Override
	public void transferAmount(Long accountAid, Long accountBid, Long amount) {
		Account accountA= this.accountRepository.findByAccountId(accountAid);
		Account accountB= this.accountRepository.findByAccountId(accountBid);
		transferRepository.transfer(accountA, accountB, amount);
		
		
	}

	

}
