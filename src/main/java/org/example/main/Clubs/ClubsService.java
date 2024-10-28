package org.example.main.Clubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClubsService {

    @Autowired
    private ClubsRepository clubsRepository;

    public List<Clubs> clubbyCompetition(String competition_code) {
        return clubsRepository.findbyCompetition(competition_code);
    }

    public Clubs clubbyId(int club_id) {
        return clubsRepository.findbyId(club_id);
    }
}
