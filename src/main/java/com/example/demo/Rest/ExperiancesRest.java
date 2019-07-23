
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
	import com.example.demo.Repository.ExperiancesRepository; 
	import com.example.demo.entity.Experiances;
  
  @RestController
  
  @RequestMapping("/experiances")
  
  @CrossOrigin("*") 
  public class ExperiancesRest {
  
  @Autowired
  private ExperiancesRepository experiancesRepository;
  
 @PostMapping("add") 
		  public void save(@RequestBody Experiances experiances)
		  
		  { 
			  experiancesRepository.save(experiances);
		  }
  
  
@GetMapping("/{idExperiance}")
		public Experiances findById(@PathVariable Long idExperiance)
		{
			return experiancesRepository.findById(idExperiance).get();
		}
@DeleteMapping("/deletet/{idExperiance}")
		public void supprimer(@PathVariable Long idExperiance) {
		
			experiancesRepository.deleteById(idExperiance);
		}
@PutMapping("edit/{idExperiance}") 

		public void update(@PathVariable Long idExperiance , @RequestBody Experiances experiances)
		
		{
			experiances.setIdExp(idExperiance);
			experiancesRepository.save(experiances);
			
		}

  
  }
 