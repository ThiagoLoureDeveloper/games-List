package com.louredev.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louredev.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
