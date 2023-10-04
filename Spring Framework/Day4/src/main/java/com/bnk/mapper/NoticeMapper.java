package com.bnk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bnk.dto.Notice;

@Mapper
public interface NoticeMapper {

	void add(Notice n);

	List<Notice> search();

	Notice searchSeq(int seq);

	List<Notice> searchTitle(String title);

	void delete(int seq);

	void update(Notice n);

}