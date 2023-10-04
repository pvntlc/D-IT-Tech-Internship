package com.bnk.model;

import java.util.List;

import com.bnk.dto.Notice;

public interface INoticeService {

	void save(Notice n);

	void delete(int seq);

	List<Notice> search();

	List<Notice> searchTitle(String title);

	void update(Notice n);

	Notice searchSeq(int seq);

}