package com.example.demo.Rest;

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

import com.example.demo.Repository.HeureSupplementaireRepository;
import com.example.demo.Repository.SalaireRepository;
import com.example.demo.entity.HeureSupplementaire;
import com.example.demo.entity.Salaires;
@RestController
@RequestMapping("/Heuresupp")
@CrossOrigin("*")

public class HeureSupplementaireRest {
	@Autowired
	private HeureSupplementaireRepository heureSupplementaireRepository;
	@Autowired
	private SalaireRepository salaireRepository ;
	
	@PostMapping("add/{idsal}") 
	
	public void save(@RequestBody HeureSupplementaire heureSupplementaire,@PathVariable Long idsal)
	{
		Salaires s = new Salaires();
		s = salaireRepository.findById(idsal).get();
		heureSupplementaire.setSalaire(s);
	heureSupplementaireRepository.save(heureSupplementaire);
	}
	
 	@GetMapping("/{id}")
	public HeureSupplementaire findById(@PathVariable Long id)
	{
		return heureSupplementaireRepository.findById(id).get();
	}
	@DeleteMapping("/deletet/{id}")
	public void supprimer(@PathVariable Long id) {
	
		heureSupplementaireRepository.deleteById(id);
	}
	@PutMapping("edit/{id}")  // modification

	public void update(@PathVariable Long id , @RequestBody HeureSupplementaire heureSupplementaire)
	
	{
		heureSupplementaire.setIdHeure(id);
		heureSupplementaireRepository.save(heureSupplementaire);
		
	}



}
