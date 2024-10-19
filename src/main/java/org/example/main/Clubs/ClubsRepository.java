package org.example.main.Clubs;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface ClubsRepository extends JpaRepository<Clubs, Long> {

    @Query("SELECT c FROM Clubs c WHERE c.domestic_competition_id = :competition_code")
    List<Clubs> findbyCompetition(@Param("competition_code") String competition_code);
}
