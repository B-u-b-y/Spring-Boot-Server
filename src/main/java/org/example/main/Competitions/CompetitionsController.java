package org.example.main.Competitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CompetitionsController {

    @Autowired
    private CompetitionsService competitionsService;

    @GetMapping("/{country_name}/competitions")
    public ResponseEntity<?> getCompetitionsByCountry(@PathVariable String country_name) {
        return ResponseEntity.ok(competitionsService.competitionbyCountry(country_name));
    }

    @GetMapping("/competitions/country")
    public ResponseEntity<?> getCountryNames() {
        return ResponseEntity.ok(competitionsService.getCountryNames());
    }

}
