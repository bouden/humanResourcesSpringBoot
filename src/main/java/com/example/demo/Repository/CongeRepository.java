package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Conges;

public interface CongeRepository extends JpaRepository<Conges, Long> {

}
