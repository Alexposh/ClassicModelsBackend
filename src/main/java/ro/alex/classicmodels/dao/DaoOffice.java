package ro.alex.classicmodels.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.alex.classicmodels.model.Office;


@Repository
public interface DaoOffice extends CrudRepository<Office, String>{

	// find...  => SELECT ... FROM TABEL
	
	// SELECT * FROM offices WHERE territory = ...
	public List<Office> findByTerritoryOrderByCity(String territory);
	public List<Office> findByTerritoryAndCountry(String territory, String country);
	
}
