package ro.alex.classicmodels.controllers;

import java.util.List;

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

import ro.alex.classicmodels.dao.DaoOffice;
import ro.alex.classicmodels.model.Office;

@RestController
@RequestMapping("/offices")
@CrossOrigin(value = { "http://localhost:5500/", "http://127.0.0.1:5500/" })
public class OfficeController {

	@Autowired
	private DaoOffice theDao;

	@GetMapping("/all")
	public Iterable<Office> findAllOfficesDb() {
		return theDao.findAll();
	}

	@GetMapping("/by-code")
	public Office findOneOffice(HttpServletRequest request) {
		Office theOffice = theDao.findById(request.getParameter("code")).get();
		return theOffice;
	}

	@GetMapping("/by-code-2/{theId}")
	public Office findOneOffice2(@PathVariable("theId") String id) {
		Office theOffice = theDao.findById(id).get();
		return theOffice;
	}

	@GetMapping("/by-territory/{territoryName}")
	public List<Office> findOfficesByTerritoryName(@PathVariable("territoryName") String territory) {
		List<Office> result = theDao.findByTerritoryOrderByCity(territory);

		return result;
	}

	@GetMapping("/by-territory-and-country/{territory}/{country}")
	public List<Office> gasesteDupaCountrySiTerritory(
			@PathVariable("territory") String territory, 
			@PathVariable("country") String country){
		
		return theDao.findByTerritoryAndCountry(territory, country);
	}

	@PostMapping("/save")
	public Office saveOffice(@RequestBody Office officeNew) {
		return theDao.save(officeNew);
	}

	@PutMapping("/update")
	public Office updateProdus(@RequestBody Office officeNew) {
		return theDao.save(officeNew);
	}

	@DeleteMapping("/delete/{id}")
	public Office deleteProduct(@PathVariable("id") String id) {
		Office officeToDelete = theDao.findById(id).get();

		theDao.delete(officeToDelete);
		return officeToDelete;
	}

}
