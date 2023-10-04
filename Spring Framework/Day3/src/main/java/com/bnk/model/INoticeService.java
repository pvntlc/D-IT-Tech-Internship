package com.bnk.model;

import java.util.List;

public interface INoticeService {

	void save(Notice n);

	void delete(int seq);

	List<Notice> search();

	Notice search(int seq);

	List<Notice> search(String title);

	void update(int cnum, String cont, String title);

}