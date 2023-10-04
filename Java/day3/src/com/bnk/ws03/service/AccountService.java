package com.bnk.ws03.service;

import com.bnk.ws03.dto.*;

public class AccountService {
	public static final int ACCOUNT_SIZE = 10;
	public static final int USER_SIZE = 5;
	public static int ACCOUNT_CURRENT_SIZE = 0;
	public static int USER_CURRENT_SIZE = 0;

	private AccountDto[] accountList = null;
	private UserDto[] userList = null;

	public AccountService() {
		accountList = new AccountDto[ACCOUNT_SIZE];
		userList = new UserDto[USER_SIZE];
	}

	public AccountDto[] getAccountList(int userSeq) {
		int index = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq)
				index++;
		}
		AccountDto[] result = new AccountDto[index];
		index = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq) {
				result[index] = accountList[i];
				index++;
			}

		}
		return result;
	}

	public UserDto getUserDetail(int userSeq) {
		for (int i = 0; i < USER_CURRENT_SIZE; i++) {
			if (userList[i].getUserSeq() == userSeq)
				return userList[i];
		}
		return null;
	}

	public void addUser(UserDto user) {
		userList[USER_CURRENT_SIZE++] = user;
	}

	public void addUserAccount(AccountDto account) {
		accountList[ACCOUNT_CURRENT_SIZE++] = account;
	}

	public AccountDto[] getAccountList() {
		AccountDto[] result = new AccountDto[ACCOUNT_CURRENT_SIZE];
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			result[i] = accountList[i];
		}
		//System.arraycopy(accountList, 0, result, 0, ACCOUNT_CURRENT_SIZE);
		return result;
	}

	public LoanAccountDto[] getLoanList() {
		int cnt = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i] instanceof LoanAccountDto) {
				cnt++;
			}
		}
		
		LoanAccountDto[] result = new LoanAccountDto[cnt];

		cnt = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i] instanceof LoanAccountDto) {
				result[cnt] = (LoanAccountDto) accountList[i];
				cnt++;
			}
		}
		return result;
	}

	public AccountDto[] getBasicAccountList() {
		int cnt = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (isAccountDto(i)) {
				cnt++;
			}
		}
		AccountDto[] result = new AccountDto[ACCOUNT_CURRENT_SIZE - cnt];

		cnt = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (isAccountDto(i)) {
				continue;
			} else {
				result[cnt] = accountList[i];
				cnt++;
			}
		}
		return result;
	}

	private boolean isAccountDto(int i) {
		return accountList[i] instanceof LoanAccountDto || accountList[i] instanceof SavingAccountDto
				|| accountList[i] instanceof InstallAccountDto;
	}

}
