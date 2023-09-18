package com.bnk;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {

	void add(AccountDTO account) throws SQLException;

	List<AccountDTO> search() throws SQLException;

	AccountDTO search(String aseq) throws SQLException;

	List<AccountDTO> searchAseq(String aseq) throws SQLException;

	List<AccountDTO> searchCseq(String aseq) throws SQLException;

	List<AccountDTO> searchPsec(String aseq) throws SQLException;

	List<AccountDTO> searchBalance(String aseq) throws SQLException;

	void delete(String aseq) throws SQLException;

}