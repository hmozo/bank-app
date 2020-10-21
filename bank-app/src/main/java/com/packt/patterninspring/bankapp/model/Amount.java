package com.packt.patterninspring.bankapp.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Amount {
	
	@NonNull private Double balance;
	
}

