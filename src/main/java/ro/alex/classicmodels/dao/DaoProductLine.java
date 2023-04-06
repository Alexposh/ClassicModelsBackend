package ro.alex.classicmodels.dao;

import org.springframework.data.repository.CrudRepository;

import ro.alex.classicmodels.model.ProductLine;

public interface DaoProductLine extends CrudRepository<ProductLine, String>{

	public ProductLine findByProductline(String name);
}
