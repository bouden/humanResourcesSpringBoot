package com.example.demo.Rest;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DTO.DepartementsDTo;
import com.example.demo.Repository.DepartementRepository;
import com.example.demo.entity.Departements;
import com.example.demo.entity.Role;




@RestController
@RequestMapping("/departements")
@CrossOrigin("*")

public class DepartementsRest {
	@Autowired
	private DepartementRepository departementRepository ;
	/*
	 * @Autowired Departements sourceDept = new Departements();
	 * 
	 * @Autowired DepartementsDTo TragetDept = new DepartementsDTo(); ModelMapper
	 * modelMapper = new ModelMapper();
	 */
	
	  @PostMapping("add") 
	  public void save(@RequestBody Departements departements)
	  { departementRepository.save(departements);
	  }
	@GetMapping("/{iddept}")
	public Departements findById(@PathVariable Long iddept)
	{
		return departementRepository.findById(iddept).get();
	}
	@DeleteMapping("/deletet/{iddept}")
	public void supprimer(@PathVariable Long iddept) {
	
		departementRepository.deleteById(iddept);
	}
	@PutMapping("edit/{iddept}")  // modification

	public void update(@PathVariable Long iddept , @RequestBody Departements departements)
	
	{
		departements.setIdDept(iddept);
		departementRepository.save(departements);
		
	}
	@GetMapping(value = "/listdepartement")
	public List<Departements> findAllDepartements() {
		return departementRepository.findAll();
	}

}
