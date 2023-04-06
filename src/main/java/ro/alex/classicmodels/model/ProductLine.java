package ro.alex.classicmodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productlines")
public class ProductLine {


	@Id
	@Column(name = "productline")
	private String productline;
	private String textdescription;
	private String htmldescription;
	private String image;
	
	public ProductLine() {
		
	}
	
	
	
	public ProductLine(String productline, String textdescription, String htmldescription, String image) {
		super();
		this.productline = productline;
		this.textdescription = textdescription;
		this.htmldescription = htmldescription;
		this.image = image;
	}
	
	public String getProductline() {
		return productline;
	}
	public void setProductline(String productline) {
		this.productline = productline;
	}
	public String getTextdescription() {
		return textdescription;
	}
	public void setTextdescription(String textdescription) {
		this.textdescription = textdescription;
	}
	public String getHtmldescription() {
		return htmldescription;
	}
	public void setHtmldescription(String htmldescription) {
		this.htmldescription = htmldescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
		
		
}
