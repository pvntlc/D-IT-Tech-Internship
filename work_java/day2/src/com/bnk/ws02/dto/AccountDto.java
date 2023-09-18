package com.bnk.ws02.dto;

public class AccountDto {
	public int accountSeq;
	public int accountNumber;
	public int balance;
	public int userSeq;

	public AccountDto() {
	}

	public AccountDto(int accountSeq, int accountNumber, int balance, int userSeq) {
		this.accountNumber = accountNumber;
		this.accountSeq = accountSeq;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq + "]";
	}

}
