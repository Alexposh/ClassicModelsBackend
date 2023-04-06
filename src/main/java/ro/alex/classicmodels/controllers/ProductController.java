package ro.alex.classicmodels.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoProduct;
import ro.alex.classicmodels.dao.DaoProductLine;
import ro.alex.classicmodels.model.Product;
import ro.alex.classicmodels.model.ProductLine;

@RestController
@RequestMapping("/products")
@CrossOrigin(value = {"http://localhost:5500/", "http://127.0.0.1:5500/", "http://localhost:4200/"})
public class ProductController {

	// TODO: add Office model, DaoOffice and OfficeController
	
	@Autowired
	private DaoProduct theDao;
	
	@Autowired
	private DaoProductLine daoProductLine;
	
//	System.out.println("SALUT");
	
	@GetMapping("/all")
	public Iterable<Product> findAllProduseDb(){
		
		return theDao.findAll();
	} 
	
	
	@GetMapping("/by-product-line/{name}")
	public List<Product> productsForProductLine(@PathVariable("name") String productLineName){
		List<Product> theProducts = new ArrayList<>();
		ProductLine productLine = daoProductLine.findByProductline(productLineName);
		theProducts = theDao.findByProductLine(productLine);
		return theProducts;
	}
	
	// ?code=32918
	// ?
	@GetMapping("/by-id")
	public Product findOneProductLel(HttpServletRequest request) {
		Product theProduct = theDao.findById(request.getParameter("code")).get();
		return theProduct;
	}
	
	// /by-id-2/30213
	// /by-id-2 - 404
	@GetMapping("/by-id-2/{theId}")
	public Product findOneProductLel2(@PathVariable("theId") String id) {
		Optional<Product> theProduct = theDao.findById(id);
		if(!theProduct.isPresent()) {
			// do stuff
			return null;
		}
		return theProduct.get();
	}
	
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product produsNou) {
		return theDao.save(produsNou);
	}
	
	@PutMapping("/update")
	public Product updateProdus(@RequestBody Product produsNou) {
		return theDao.save(produsNou);
	}
	
	@DeleteMapping("/delete/{id}")
	public Product deleteProduct(@PathVariable("id") String id) {
		Product productToDelete = theDao.findById(id).get();
		
		theDao.delete(productToDelete);
		return productToDelete;
	}
	
}
