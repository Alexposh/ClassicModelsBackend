package ro.alex.classicmodels.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Office {

	@Id // primary key
	private String officecode;
	private String city;
	private String phone;
	private String addressline1;
	private String addressline2;
	private String state;
	private String country;
	private String postalcode;
	private String territory;
	
	@OneToMany
	@JoinColumn(name="officecode")
	private Set<Employee> employees;
	
	public String getOfficecode() {
		return officecode;
	}

	public void setOfficecode(String officecode) {
		this.officecode = officecode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}




	
	public Office() {
	}

	
	
	public Office(String officecode, String city) {
		this.officecode = officecode;
		this.city = city;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	

//
//
//	public String getProductcode() {
//		return productcode;
//	}
//	public void setProductcode(String productcode) {
//		this.productcode = productcode;
//	}
//	public String getProductname() {
//		return productname;
//	}
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
//
//
//
//	public String getProductline() {
//		return productline;
//	}
//
//
//
//	public void setProductline(String productline) {
//		this.productline = productline;
//	}
//
//
//
//	public String getProductscale() {
//		return productscale;
//	}
//
//
//
//	public void setProductscale(String productscale) {
//		this.productscale = productscale;
//	}
//
//
//
//	public String getProductvendor() {
//		return productvendor;
//	}
//
//
//
//	public void setProductvendor(String productvendor) {
//		this.productvendor = productvendor;
//	}
//
//
//
//	public String getProductdescription() {
//		return productdescription;
//	}
//
//
//
//	public void setProductdescription(String productdescription) {
//		this.productdescription = productdescription;
//	}
//
//
//
//	public Integer getQuantityinstock() {
//		return quantityinstock;
//	}
//
//
//
//	public void setQuantityinstock(Integer quantityinstock) {
//		this.quantityinstock = quantityinstock;
//	}



//	public Double getBuyprice() {
//		return buyprice;
//	}
//
//
//
//	public void setBuyprice(Double buyprice) {
//		this.buyprice = buyprice;
//	}
//
//
//
//	public Double getMsrp() {
//		return msrp;
//	}
//
//
//
//	public void setMsrp(Double msrp) {
//		this.msrp = msrp;
//	}
	
	
}
