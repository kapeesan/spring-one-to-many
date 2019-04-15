package com.example.SpringWork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWork.model.Card;
import com.example.SpringWork.model.Page;
import com.example.SpringWork.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	CardRepository cardRepository;
	
	@Override
	public Card save(Card card) {
		// TODO Auto-generated method stub
		
		for (Page page:card.getPages()) {
			page.setCard(card);
		}
		System.out.println("hello from card");
		return cardRepository.save(card);
		
	}

}
