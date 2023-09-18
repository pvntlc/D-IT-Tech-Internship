package com.bnk;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {

	void add(AccountDTO account) throws SQLException;

	List<AccountDTO> search() throws SQLException;

	AccountDTO search(String aseq) throws SQLException;

	List<AccountDTO> searchAseq(String aseq) throws SQLException;

	List<AccountDTO> searchCseq(int cseq) throws SQLException;

	List<AccountDTO> searchPsec(int pseq) throws SQLException;

	List<AccountDTO> searchBalance(int balance) throws SQLException;
	
	void deposit(String aseq, int money) throws SQLException;

	void delete(String aseq) throws SQLException;

	void withdraw(String aseq, int money) throws SQLException;

}