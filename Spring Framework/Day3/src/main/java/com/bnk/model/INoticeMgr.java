package com.bnk.model;

import java.util.List;

public interface INoticeMgr {

	void add(Notice n);

	List<Notice> search();

	Notice search(int seq);

	List<Notice> search(String title);

	void delete(int seq);

	void update(int cnum, String cont, String title);

}