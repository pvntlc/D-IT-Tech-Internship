package com.bnk.ws04.dto;

public class LoanAccountDto extends AccountDto {
	private String mortgage;

	public LoanAccountDto() {
	}

	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
		// TODO Auto-generated constructor stub
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	@Override
	public String toString() {
		return "LoanAccountDto [toString()=" + super.toString() + ", mortgage=" + mortgage + "]";
	}

}
