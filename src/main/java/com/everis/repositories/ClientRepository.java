package com.everis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

}
