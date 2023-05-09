package com.dev.superior.dslist.services;

import com.dev.superior.dslist.dto.GameMinDTO;
import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
