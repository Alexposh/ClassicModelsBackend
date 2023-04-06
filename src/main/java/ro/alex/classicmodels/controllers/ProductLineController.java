package ro.alex.classicmodels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoProductLine;
import ro.alex.classicmodels.model.ProductLine;

@RestController
@RequestMapping("/productlines")
@CrossOrigin(value = {"http://localhost:5500/", "http://127.0.0.1:5500/", "http://localhost:4200/"})
public class ProductLineController {

	
	@Autowired
	private DaoProductLine theDao;
	
	@GetMapping("/all")
	public Iterable<ProductLine> findAllProductLinesDb(){
		
		return theDao.findAll();
	} 
	
	
	//findByProductline
	@GetMapping("/by-name/{name}")
	public ProductLine productResulted(@PathVariable("name") String name) {
		ProductLine product = theDao.findByProductline(name);
		
		return product;
	} 
}
