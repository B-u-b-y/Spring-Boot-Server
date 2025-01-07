package org.example.main.Competitions;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Tag(name = "Competitions", description = "API for managing competitions and countries")
public class CompetitionsController {

    @Autowired
    private CompetitionsService competitionsService;

    /**
     * Fetch all competitions by country name
     * @param country_name The name of the country to fetch competitions for
     * @return List of competitions in the specified country
     */
    @Operation(summary = "Get competitions by country", description = "Retrieve all competitions in a specific country")
    @GetMapping("/{country_name}/competitions")
    public ResponseEntity<?> getCompetitionsByCountry(@PathVariable String country_name) {
        return ResponseEntity.ok(competitionsService.competitionbyCountry(country_name));
    }

    /**
     * Fetch all available country names for competitions
     * @return List of country names
     */
    @Operation(summary = "Get country names", description = "Retrieve a list of all countries available in the competition data")
    @GetMapping("/competitions/country")
    public ResponseEntity<?> getCountryNames() {
        return ResponseEntity.ok(competitionsService.getCountryNames());
    }
}
