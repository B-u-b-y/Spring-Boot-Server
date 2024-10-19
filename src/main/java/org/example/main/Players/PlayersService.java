package org.example.main.Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayersService {

    @Autowired
    private PlayersRepository playersRepository;

    public List<Players> playerbyClub(int club) {
        return playersRepository.findbyClub(club);
    }

    public Players playerbyId(int player_id) {
        return playersRepository.findbyId(player_id);
    }

}
