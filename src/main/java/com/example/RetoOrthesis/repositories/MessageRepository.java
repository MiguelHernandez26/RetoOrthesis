package com.example.RetoOrthesis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RetoOrthesis.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{
    
}
