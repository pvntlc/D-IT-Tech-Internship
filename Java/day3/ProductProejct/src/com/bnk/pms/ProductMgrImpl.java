package com.bnk.pms;

import java.util.ArrayList;
import java.util.List;

import com.bnk.pms.excep.CodeNotFoundException;
import com.bnk.pms.excep.DuplicateException;
import com.bnk.pms.excep.ProductNotFoundException;

public class ProductMgrImpl implements IProductMgr {

	List<Product> ps = new ArrayList<>();
	private static ProductMgrImpl instance = new ProductMgrImpl();

	private ProductMgrImpl() {

	}

	static {
		// 파일 읽어들이기.
	}

	public static ProductMgrImpl getInstance() {
		return instance;
	}

	@Override
	public void add(Product p) throws DuplicateException {
		for(Product pp : ps) {
			if(pp.equals(p)) {
				throw new DuplicateException();
			}
		}
		
		ps.add(p);

	}
	

	@Override
	public List<Product> search() {
		// TODO Auto-generated method stub

		return ps;
	}

	@Override
	public Product search(String num) throws CodeNotFoundException {
		// TODO Auto-generated method stub
		Product result = new Product();
		for (Product p : ps) {
			if (p.getNum().equals(num)) {
				result = p;
				break;
			}
		}
		if(result.equals(null)) {
			throw new CodeNotFoundException();
		}
		return result;
	}

	@Override
	public List<Product> searchTitle(String title) {
		// TODO Auto-generated method stub
		List<Product> result = new ArrayList<>();
		for (Product p : ps) {
			if (p.getTitle().contains(title)) {
				result.add(p);
			}
		}
		return result;
	}

	@Override
	public List<TV> searchTV() {
		// TODO Auto-generated method stub
		List<TV> result = new ArrayList<>();
		for (Product p : ps) {
			if (p instanceof TV) {
				result.add((TV) p);
			}
		}
		return result;
	}

	@Override
	public List<Refrigerator> searchRefrigerator() {
		List<Refrigerator> result = new ArrayList<>();
		for (Product p : ps) {
			if (p instanceof Refrigerator) {
				result.add((Refrigerator) p);
			}
		}
		return result;
	}

	@Override
	public List<Refrigerator> searchRefrigerator(int liter) throws ProductNotFoundException {
		List<Refrigerator> result = new ArrayList<>();
		for (Product p : ps) {
			if (p instanceof Refrigerator && ((Refrigerator) p).getLiter() >= liter) {
				result.add((Refrigerator) p);
			}
		}
		if(result == null) {
			throw new ProductNotFoundException();
		}
		return result;
	}

	@Override
	public List<TV> searchTV(int inch) throws ProductNotFoundException {
		List<TV> result = new ArrayList<>();
		for (Product p : ps) {
			if (p instanceof TV && ((TV) p).getInch() >= inch) {
				result.add((TV) p);
			}
		}
		if(result.isEmpty()) {
			throw new ProductNotFoundException();
		}
		return result;
	}

	@Override
	public void updatePrice(String num, int price) throws CodeNotFoundException {
		Product p = search(num);
		if (p != null)
			p.setPrice(price);
		else
			System.out.println("상품을 찾지 못했음.");
	}

	@Override
	public void deleteProduct(String num) throws CodeNotFoundException {
		Product p = search(num);
		if (p != null)
			ps.remove(p);
		else
			System.out.println("상품을 찾지 못했음.");
		// TODO Auto-generated method stub

	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (Product p : ps) {
			total += p.getPrice() * p.getQuant();
		}
		return total;
	}

}
