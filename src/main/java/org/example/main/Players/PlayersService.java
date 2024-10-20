package org.example.main.Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
