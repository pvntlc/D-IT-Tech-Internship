package com.bnk.ws03.view;

import com.bnk.ws03.dto.*;
import com.bnk.ws03.service.AccountService;

public class AccountTest {
	public static void main(String[] args) {
		AccountService as = new AccountService();
		as.addUserAccount(new LoanAccountDto(1, "22", 1, 1, "1"));
		as.addUserAccount(new LoanAccountDto(1, "2112", 1, 1, "1"));
		as.addUserAccount(new LoanAccountDto(1, "25552", 1, 1, "1"));

		as.addUserAccount(new SavingAccountDto(1, "222", 1, 2, 3));
		
		as.addUserAccount(new InstallAccountDto(1, "1234", 1, 2, 3, 4));
		
		as.addUserAccount(new AccountDto(111, "23123", 1234, 1234));
		as.addUserAccount(new AccountDto(111, "231223", 1234, 1234));


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

	}

}
