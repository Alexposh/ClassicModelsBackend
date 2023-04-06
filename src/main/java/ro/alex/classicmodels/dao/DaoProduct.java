package ro.alex.classicmodels.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.alex.classicmodels.model.Product;
import ro.alex.classicmodels.model.ProductLine;

@Repository
public interface DaoProduct extends CrudRepository<Product, String>{

	
	public List<Product> findByProductLine(ProductLine productLine);
	
}
