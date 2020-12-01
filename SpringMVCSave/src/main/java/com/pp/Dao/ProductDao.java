package com.pp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.pp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Save Product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}

	// Fetch All Product
	public List<Product> getProduct() {
		List<Product> product = this.hibernateTemplate.loadAll(Product.class);
		return product;
	}

	// Fetch One Product
	public Product getOneProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);

	}

	// Delete Product
	@Transactional
	public void deleteProduct(int pid) {
		Product pp = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(pp);
	}

}
