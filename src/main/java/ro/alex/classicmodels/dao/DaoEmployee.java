package ro.alex.classicmodels.dao;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ro.alex.classicmodels.model.Employee;


@Repository
public interface DaoEmployee extends CrudRepository<Employee, Integer>{

}
