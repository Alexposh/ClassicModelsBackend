package ro.alex.classicmodels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@Column(name="employeenumber")
	private Integer employeeNumber;
	
	@Column(name="lastname")
	private String lastName; // last_name
	
	@Column(name="firstname")
	private String firstName;
	
//	@Column(name="officecode")
//	private Integer officeCode;
	
//	@ManyToOne
//	@JoinColumn(name="officecode")
//	private Office office;
	/*
	 * Office o1 = new Office();
	 * Office o2 = new Office();
	 * 
	 * Employee e1 = new Employee();
	 * Employee e2 = new Employee();
	 * 
	 * e1.setOffice(o1);
	 * e2.setOffice(o1);
	 * 
	 * Employee ceo = new Employee();
	 * ceo.setOffice(o1);
	 * ceo.setOffice(o2); 
	 * */

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	public Office getOffice() {
//		return office;
//	}
//
//	public void setOffice(Office office) {
//		this.office = office;
//	}

//	public Integer getOfficeCode() {
//		return officeCode;
//	}
//
//	public void setOfficeCode(Integer officeCode) {
//		this.officeCode = officeCode;
//	} 
//	
//	
	
	
//	CREATE TABLE `employees` (
//			  `employeeNumber` int(11) NOT NULL,
//			  `lastName` varchar(50) NOT NULL,
//			  `firstName` varchar(50) NOT NULL,
//			  `extension` varchar(10) NOT NULL,
//			  `email` varchar(100) NOT NULL,
//			  `officeCode` varchar(10) NOT NULL,
//			  `reportsTo` int(11) DEFAULT NULL,
//			  `jobTitle` varchar(50) NOT NULL,
//			  PRIMARY KEY (`employeeNumber`),
//			  KEY `reportsTo` (`reportsTo`),
//			  KEY `officeCode` (`officeCode`),
//			  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`reportsTo`) REFERENCES `employees` (`employeeNumber`),
//			  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`officeCode`) REFERENCES `offices` (`officeCode`)
//			) ENGINE=InnoDB DEFAULT CHARSET=latin1;
	
	

}
