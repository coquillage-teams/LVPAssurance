package com.everis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.entities.Assurance;


@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Long> {

}
