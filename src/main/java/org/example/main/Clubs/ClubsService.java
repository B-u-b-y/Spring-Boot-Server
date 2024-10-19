package org.example.main.Clubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClubsService {

    @Autowired
    private ClubsRepository clubsRepository;

    public List<Clubs> clubbyCompetition(String competition_code) {
        return clubsRepository.findbyCompetition(competition_code);
    }

}
