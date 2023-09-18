package com.bnk.ws02.view;

import com.bnk.ws02.dto.*;
import com.bnk.ws02.service.AccountService;

public class AccountTest {
	public static void main(String[] args) {
		AccountService as = new AccountService();
		as.addUser(new UserDto(123, "김광덕", "ASDFASDF", "123123123", true));
		as.addUserAccount(new AccountDto(1213, 1223, 1243, 123));
		as.addUserAccount(new AccountDto(1234, 1523, 5123, 123));
		AccountDto[] result = as.getAccountList(123);

		for (AccountDto ad : result) {
			System.out.println(ad);
		}

		System.out.println(as.getUserDetail(123));
	}

}
