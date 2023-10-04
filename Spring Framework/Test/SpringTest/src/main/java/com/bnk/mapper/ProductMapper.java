package com.bnk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bnk.dto.Product;

@Mapper
public interface ProductMapper {

	void add(Product p);

	List<Product> search(String word);

	Product searchCode(int code);

	void update(Product p);

	Product searchTitle(String title);

	List<Product> searchBoon(String word);

	void delete(String code);

}
