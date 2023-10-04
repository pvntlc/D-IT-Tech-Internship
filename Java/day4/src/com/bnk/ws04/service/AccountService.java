package com.bnk.ws04.service;

import java.util.ArrayList;

import com.bnk.ws04.dto.*;

public class AccountService implements IAccountService {

	private static IAccountService instance = new AccountService();
	private ArrayList<AccountDto> accountList = null;
	private ArrayList<UserDto> userList = null;

	public static IAccountService getInstace() {
		return instance;
	}

	private AccountService() {
		accountList = new ArrayList<>();
		userList = new ArrayList<>();
	}

	@Override
	public AccountDto[] getAccountList(int userSeq) {
		int count = 0;
		for (AccountDto ac : accountList) {
			if (ac.getUserSeq() == userSeq) {
				count++;
			}
		}
		AccountDto[] result = new AccountDto[count];
		count = 0;
		for (AccountDto ac : accountList) {
			if (ac.getUserSeq() == userSeq) {
				result[count++] = ac;
			}
		}
		return result;
	}

	@Override
	public UserDto getUserDetail(int userSeq) {
		for (UserDto user : userList) {
			if (user.getUserSeq() == userSeq)
				return user;
		}
		return null;
	}

	@Override
	public void addUser(UserDto user) {
		userList.add(user);
	}

	@Override
	public void addAccount(AccountDto account) {
		accountList.add(account);
	}

	@Override
	public ArrayList<AccountDto> getAccountList() {
		ArrayList<AccountDto> result = new ArrayList<AccountDto>();

		for (AccountDto ac : accountList) {
			result.add(ac);
		}
		// System.arraycopy(accountList, 0, result, 0, ACCOUNT_CURRENT_SIZE);
		return result;
	}

	@Override
	public ArrayList<LoanAccountDto> getLoanList() {
		ArrayList<LoanAccountDto> result = new ArrayList<LoanAccountDto>();

		for (AccountDto ac : accountList) {
			if (ac instanceof LoanAccountDto) {
				result.add((LoanAccountDto) ac);
			}
		}

		return result;
	}

	@Override
	public ArrayList<AccountDto> getBasicAccountList() {

		ArrayList<AccountDto> result = new ArrayList<AccountDto>();
		for (AccountDto ac : accountList) {
			if (!isAccountDto(ac))
				result.add(ac);
		}
		return result;
	}

	private boolean isAccountDto(AccountDto ac) {
		return ac instanceof LoanAccountDto || ac instanceof SavingAccountDto || ac instanceof InstallAccountDto;
	}

}
