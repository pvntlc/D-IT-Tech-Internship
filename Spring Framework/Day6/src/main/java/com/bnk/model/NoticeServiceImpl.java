package com.bnk.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnk.user.dto.Notice;
import com.bnk.user.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements INoticeService {
	@Autowired
	NoticeMapper instance;
	@Override
	public void save(Notice n) {
		instance.add(n);
	}
	
	@Override
	public void delete(int seq) {
		instance.delete(seq);
	}
	
	@Override
	public List<Notice> search(String word) {
		word = (word!=null && word.length()!= 0) ? "%"+word+"%" : null;
		return instance.search(word);
	}
	
	@Override
	public Notice searchSeq(int seq) {
		return instance.searchSeq(seq);
	}
	
	@Override
	public List<Notice> searchTitle(String title) {
		return instance.searchTitle(title);
	}

	@Override
	public void update(Notice n) {
		instance.update(n);
		
	}
}
