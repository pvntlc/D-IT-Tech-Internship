package com.bnk.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements INoticeService {
	@Autowired
	INoticeMgr instance;
	@Override
	public void save(Notice n) {
		instance.add(n);
	}
	
	@Override
	public void delete(int seq) {
		instance.delete(seq);
	}
	
	@Override
	public List<Notice> search() {
		return instance.search();
	}
	
	@Override
	public Notice search(int seq) {
		return instance.search(seq);
	}
	
	@Override
	public List<Notice> search(String title) {
		return instance.search(title);
	}
}
