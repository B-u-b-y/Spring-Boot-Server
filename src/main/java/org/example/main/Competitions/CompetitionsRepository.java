package org.example.main.Competitions;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompetitionsRepository extends JpaRepository<Competitions, Long> {

    @Query("SELECT c.competition_code FROM Competitions c WHERE c.country_name = :country_name")
    List<String> findbyCountryName(@Param("country_name") String country_name);

    @Query("SELECT DISTINCT c.country_name FROM Competitions c")
    List<String> findCountryNames();
}
