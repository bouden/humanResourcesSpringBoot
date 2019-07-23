package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.DepartementRepository;
import com.example.demo.Repository.ExperiancesRepository;
import com.example.demo.Repository.PersonnelsRepository;
import com.example.demo.Repository.SalaireRepository;
import com.example.demo.entity.Departements;
import com.example.demo.entity.Experiances;
import com.example.demo.entity.Personnels;
import com.example.demo.entity.Role;
import com.example.demo.entity.Salaires;

@RestController
@RequestMapping("/personnels")
@CrossOrigin("*")
public class PersonnelsRest {
	@Autowired
	private PersonnelsRepository personnelsRepository;
	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private SalaireRepository salaireRepository;
	@Autowired
	private ExperiancesRepository experiancesRepository;
	@PostMapping("add/{idDept}/{idExperiance}/{idsal}") 
			public void save(@RequestBody Personnels personnel, @PathVariable Long idDept,@PathVariable Long idExperiance ,@PathVariable Long idsal)
			{
			Experiances e = new Experiances();
			Salaires s=new Salaires();
			Departements d = new Departements();
			d = departementRepository.findById(idDept).get();
			s = salaireRepository.findById(idsal).get();
			e = experiancesRepository.findById(idExperiance).get();
			personnel.setDepartements(d);
			personnel.setSalaires(s);
			personnel.setExperiance(e);
			personnelsRepository.save(personnel);
			}
	
 	@GetMapping("/{id}")
			public Personnels findById(@PathVariable Long id)
			{
				return personnelsRepository.findById(id).get();
			}
	@DeleteMapping("/deletet/{id}")
			public void supprimer(@PathVariable Long id) {
			
			personnelsRepository.deleteById(id);
			}
	@PutMapping("edit/{id}")  // modification

			public void update(@PathVariable Long id_Personnel , @RequestBody Personnels personnel)
			
			{
				personnel.setId_Personnel(id_Personnel);
				personnelsRepository.save(personnel);
				
			}
	@GetMapping(value = "/listpersonnels")
	public List<Personnels> findAllPersonnels() {
		return personnelsRepository.findAll();
}
	}
