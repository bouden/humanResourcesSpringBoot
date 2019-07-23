package com.example.demo.Rest;

import java.util.Collection;

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
import com.example.demo.Repository.PrimeRepository;
import com.example.demo.Repository.SalaireRepository;
import com.example.demo.entity.HeureSupplementaire;
import com.example.demo.entity.Prime;
import com.example.demo.entity.Salaires;
@RestController
@RequestMapping("/salaires")
@CrossOrigin("*")

public class SalairesRest {
	@Autowired
	private SalaireRepository salaireRepository ;

	
	@PostMapping("add") 
	public void save(@RequestBody Salaires salaires)
	{ 

		salaireRepository.save(salaires);
	}
	@GetMapping("/{idsal}")
	public Salaires findById(@PathVariable Long idsal)
	{
		return salaireRepository.findById(idsal).get();
	}
	@DeleteMapping("/deletet/{idsal}")
	public void supprimer(@PathVariable Long idsal) {
	
		salaireRepository.deleteById(idsal);
	}
	@PutMapping("edit/{idsal}")  // modification

	public void update(@PathVariable Long idsal , @RequestBody Salaires salaires)
	
	{
		salaires.setIdSalair(idsal);
		salaireRepository.save(salaires);
		
	}

}
