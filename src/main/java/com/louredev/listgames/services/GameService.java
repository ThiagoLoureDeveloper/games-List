package com.louredev.listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louredev.listgames.dto.GameMinDto;
import com.louredev.listgames.entities.Game;
import com.louredev.listgames.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDto(x)).toList();
		
	}

}
