package com.bnk.ws04.view;

import com.bnk.ws04.dto.*;
import com.bnk.ws04.service.AccountService;
import com.bnk.ws04.service.IAccountService;

public class AccountTest {
	public static void main(String[] args) {
		IAccountService as = AccountService.getInstace();
		as.addAccount(new LoanAccountDto(1, "22", 1, 1, "1"));
		as.addAccount(new LoanAccountDto(1, "2112", 1, 1, "1"));
		as.addAccount(new LoanAccountDto(1, "25552", 1, 1, "1"));
		as.addAccount(new SavingAccountDto(1, "222", 1, 2, 3));
		as.addAccount(new InstallAccountDto(1, "1234", 1, 2, 3, 4));
		as.addAccount(new AccountDto(111, "23123", 1234, 1234));
		as.addAccount(new AccountDto(111, "231223", 1234, 1234));
		as.addUser(new UserDto(1, "김팡틱", "lightbulb11@naver.com", "010-3380-6340", false));

		System.out.println(as.getUserDetail(1));
		System.out.println("========================");

		for (LoanAccountDto dd : as.getLoanList()) {
			System.out.println(dd);
		}
		System.out.println("========================");
		for (AccountDto dd : as.getBasicAccountList()) {
			System.out.println(dd);
		}
		System.out.println("========================");
		for (AccountDto dd : as.getAccountList()) {
			System.out.println(dd);
		}
		System.out.println("========================");
		for (AccountDto aa : as.getAccountList(1)) {
			System.out.println(aa);
		}

	}

}
