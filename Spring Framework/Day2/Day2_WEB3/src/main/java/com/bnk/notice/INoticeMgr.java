package com.bnk.notice;

import java.util.List;

public interface INoticeMgr {

	void add(Notice n);

	List<Notice> search();

	Notice search(int seq);

	List<Notice> search(String title);

	void delete(int seq);

}