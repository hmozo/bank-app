package com.packt.patterninspring.bankapp.service;

public interface TransferService {
	
	void transferAmount(Long accountA, Long accountB, Long amount);
}
