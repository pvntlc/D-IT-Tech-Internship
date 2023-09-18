package com.bnk.ws04.dto;

public class InstallAccountDto extends AccountDto {
	private int period;
	private int amount;

	public InstallAccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
		// TODO Auto-generated constructor stub
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InstallAccountDto [toString()=" + super.toString() + ", period=" + period + ", amount=" + amount + "]";
	}

}
