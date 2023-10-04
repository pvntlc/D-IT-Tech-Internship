package com.bnk.ws02.service;

import com.bnk.ws02.dto.AccountDto;
import com.bnk.ws02.dto.UserDto;

public class AccountService {
	AccountDto[] accountList = new AccountDto[10];
	UserDto[] userList = new UserDto[5];
	int ACCOUNT_SIZE = 5;
	int USER_SIZE = 10;
	int ACCOUNT_CURRENT_SIZE = 0;
	int USER_CURRENT_SIZE = 0;

	public void addUserAccount(AccountDto account) {
		accountList[ACCOUNT_CURRENT_SIZE++] = account;
	}

	public void addUser(UserDto user) {
		userList[USER_CURRENT_SIZE++] = user;
	}

	public UserDto getUserDetail(int userSeq) {
		for (int i = 0; i < USER_CURRENT_SIZE; i++) {
			if (userList[i].userSeq == userSeq)
				return userList[i];
		}
		return null;
	}

	public AccountDto[] getAccountList(int userSeq) {
		int index = 0;
		int rindex = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].userSeq == userSeq)
				index++;
		}
		AccountDto[] result = new AccountDto[index];
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].userSeq == userSeq) {
				result[rindex] = accountList[i];
				rindex++;
			}

		}
		return result;
	}

}
