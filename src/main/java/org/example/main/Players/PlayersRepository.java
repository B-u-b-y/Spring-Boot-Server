package org.example.main.Players;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface PlayersRepository extends JpaRepository<Players, Long> {

    @Query("SELECT p FROM Players p WHERE p.current_club_id = :club")
    List<Players> findbyClub(@Param("club") int club);

    @Query("SELECT p FROM Players p WHERE p.player_id = :player_id")
    Players findbyId(@Param("player_id") int player_id);

}
