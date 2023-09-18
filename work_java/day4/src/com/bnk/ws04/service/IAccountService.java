package com.bnk.ws04.service;

import java.util.ArrayList;

import com.bnk.ws04.dto.AccountDto;
import com.bnk.ws04.dto.LoanAccountDto;
import com.bnk.ws04.dto.UserDto;

public interface IAccountService {

	AccountDto[] getAccountList(int userSeq);

	UserDto getUserDetail(int userSeq);

	void addUser(UserDto user);

	void addAccount(AccountDto account);

	ArrayList<AccountDto> getAccountList();

	ArrayList<LoanAccountDto> getLoanList();

	ArrayList<AccountDto> getBasicAccountList();

}