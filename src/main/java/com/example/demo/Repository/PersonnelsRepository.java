package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Personnels;
@CrossOrigin(origins = "http://localhost:4200")
public interface PersonnelsRepository extends JpaRepository<Personnels, Long> {

}
