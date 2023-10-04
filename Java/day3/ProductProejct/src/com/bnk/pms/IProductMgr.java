package com.bnk.pms;

import java.util.List;

import com.bnk.pms.excep.CodeNotFoundException;
import com.bnk.pms.excep.DuplicateException;
import com.bnk.pms.excep.ProductNotFoundException;

public interface IProductMgr {

	// 상품정보 저장
	void add(Product p) throws DuplicateException;

	// 상품 전체 검색
	List<Product> search();

	// 상품번호 검색
	Product search(String num) throws CodeNotFoundException;

	// 상품명으로 상품 검색
	List<Product> searchTitle(String title);

	// TV 정보만 검색
	List<TV> searchTV();

	// Refrigerator만 검색
	List<Refrigerator> searchRefrigerator();

	// 특정 리터 이상의 Refri 검색
	List<Refrigerator> searchRefrigerator(int liter) throws ProductNotFoundException;

	// 특정 인치 이상의 tv 검색
	List<TV> searchTV(int inch) throws ProductNotFoundException;

	// 상품번호와 가격을 입력 받아 상품 가격을 변경
	void updatePrice(String num, int price) throws CodeNotFoundException;

	// 상품번호로 상품 삭제
	void deleteProduct(String num) throws CodeNotFoundException;

	// 전체 재고 상품 금액
	int getTotalPrice();

}
