package com.packt.patterninspring.bankapp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NonNull private Long accountId;
	@NonNull private String name;
	@NonNull private Amount amount;

}
