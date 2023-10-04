package com.bnk.notice;

import java.util.List;

public interface INoticeService {

	void save(Notice n);

	void delete(int seq);

	List<Notice> search();

	Notice search(int seq);

	List<Notice> search(String title);

}