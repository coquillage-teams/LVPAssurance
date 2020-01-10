package com.everis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.entities.Plainte;


@Repository
public interface PlainteRepository extends JpaRepository<Plainte, Long> {

}
