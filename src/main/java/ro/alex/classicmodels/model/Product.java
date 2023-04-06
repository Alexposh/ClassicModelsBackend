package ro.alex.classicmodels.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id // primary key
	private String productcode;
	private String productname;
//	private String productline;
	private String productscale;
	private String productvendor;
	private String productdescription;
	private Integer quantityinstock;
	private Double buyprice;
	private Double msrp;
	
	@ManyToOne
	@JoinColumn(name="productline")
	private ProductLine productLine;
	
//	CREATE TABLE `products` (
//			  `productCode` varchar(15) NOT NULL,
//			  `productName` varchar(70) NOT NULL,
//			  `productLine` varchar(50) NOT NULL,
//			  `productScale` varchar(10) NOT NULL,
//			  `productVendor` varchar(50) NOT NULL,
//			  `productDescription` text NOT NULL,
//			  `quantityInStock` smallint(6) NOT NULL,
//			  `buyPrice` decimal(10,2) NOT NULL,
//			  `MSRP` decimal(10,2) NOT NULL,
//			  PRIMARY KEY (`productCode`),
//			  KEY `productLine` (`productLine`),
//			  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`productLine`) REFERENCES `productlines` (`productLine`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	
	public Product() {
	}

	
	
	public Product(String productcode, String productname) {
		this.productcode = productcode;
		this.productname = productname;
	}



	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}



//	public String getProductline() {
//		return productline;
//	}
//
//
//
//	public void setProductline(String productline) {
//		this.productline = productline;
//	}



	public String getProductscale() {
		return productscale;
	}



	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}



	public String getProductvendor() {
		return productvendor;
	}



	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}



	public String getProductdescription() {
		return productdescription;
	}



	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}



	public Integer getQuantityinstock() {
		return quantityinstock;
	}



	public void setQuantityinstock(Integer quantityinstock) {
		this.quantityinstock = quantityinstock;
	}



	public Double getBuyprice() {
		return buyprice;
	}



	public void setBuyprice(Double buyprice) {
		this.buyprice = buyprice;
	}



	public Double getMsrp() {
		return msrp;
	}



	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}



	public ProductLine getProductLine() {
		return productLine;
	}



	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}
	
	
	
	
}
