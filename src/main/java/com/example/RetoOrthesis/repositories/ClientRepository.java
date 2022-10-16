package com.example.RetoOrthesis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoOrthesis.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
