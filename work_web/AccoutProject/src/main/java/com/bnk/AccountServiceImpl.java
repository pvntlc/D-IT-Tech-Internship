package com.bnk;

import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;

public class AccountServiceImpl implements AccountService {
	private AccountDao dao;

	public AccountServiceImpl() {
		dao = new AccountDaoImpl();
	}

	@Override
	public void add(AccountDTO account) throws SQLException {
		dao.add(account);
	}

	@Override
	public List<AccountDTO> search() throws SQLException {
		return dao.search();
	}

	@Override
	public AccountDTO search(String aseq) throws SQLException {
		return dao.search(aseq);
	}

	@Override
	public void delete(String aseq) throws SQLException {
		dao.delete(aseq);
	}

	@Override
	public List<AccountDTO> searchAseq(String aseq) throws SQLException {
		return dao.searchAseq(aseq);
	}

	@Override
	public List<AccountDTO> searchCseq(String cseq) throws SQLException {
		if (cseq.equals("")) {
			return dao.search();
		} else if (cseq.matches("[+-]?\\d*(\\.\\d+)?"))
			return dao.searchCseq(Integer.parseInt(cseq));
		else
			return null;
	}

	@Override
	public List<AccountDTO> searchPsec(String pseq) throws SQLException {
		if (pseq.equals("")) {
			return dao.search();
		} else if (pseq.matches("[+-]?\\d*(\\.\\d+)?"))
			return dao.searchPsec(Integer.parseInt(pseq));
		else
			return null;
	}

	@Override
	public List<AccountDTO> searchBalance(String balance) throws SQLException {
		if (balance.equals("")) {
			return dao.search();
		} else if (balance.matches("[+-]?\\d*(\\.\\d+)?"))
			return dao.searchBalance(Integer.parseInt(balance));
		else
			return null;
	}
}
