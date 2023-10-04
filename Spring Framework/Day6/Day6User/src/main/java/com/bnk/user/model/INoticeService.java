package com.bnk.user.model;

import java.util.List;

import com.bnk.user.dto.Notice;

public interface INoticeService {

	void save(Notice n);

	void delete(int seq);

	List<Notice> search(String word);

	List<Notice> searchTitle(String title);

	void update(Notice n);

	Notice searchSeq(int seq);

}