package com.example.SpringWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringWork.model.Card;

public interface CardRepository extends JpaRepository<Card, Integer>{

}
