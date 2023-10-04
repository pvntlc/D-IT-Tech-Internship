package com.bnk.model;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnk.dto.Product;
import com.bnk.mapper.ProductMapper;

@Service
public class ProductServiceImpl {
	@Autowired
	ProductMapper dao;
	
	public void save(Product p) throws SQLException {
		dao.add(p);
	}
	
	public List<Product> search(String word) throws SQLException {
		word = (word!=null && word.length()!= 0) ? "%"+word+"%" : null;
		return dao.search(word);
	}
	
	public List<Product> searchBoon(String word) throws SQLException {
		word = (word!=null && word.length()!= 0) ? "%"+word+"%" : null;
		return dao.searchBoon(word);
	}
	
	
	
	public Product search(int code) throws SQLException{
		return dao.searchCode(code);
	}
	
	public void delete(String code) throws SQLException{
		dao.delete(code);
	}
	
	public void update(Product p) throws SQLException{
		dao.update(p);
	}
	
	public Product searchTitle(String title) throws SQLException{
		return dao.searchTitle(title);
	}

}
