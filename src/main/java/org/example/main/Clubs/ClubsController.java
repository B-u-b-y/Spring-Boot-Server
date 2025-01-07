package org.example.main.Clubs;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Tag(name = "Clubs", description = "API for managing clubs and their associated competitions")
public class ClubsController {

    private final ClubsService clubsService;

    public ClubsController(ClubsService clubsService) {
        this.clubsService = clubsService;
    }

    /**
     * Fetch all clubs by competition name
     * @param competition The competition name to fetch clubs for
     * @return List of clubs associated with the specified competition
     */
    @Operation(summary = "Get clubs by competition", description = "Retrieve all clubs participating in a specific competition")

    @GetMapping("/{competition}/clubs")
    public ResponseEntity<?> getClubsByCountry(@PathVariable String competition) {
        return ResponseEntity.ok(clubsService.clubbyCompetition(competition));
    }

    /**
     * Fetch club details by club ID
     * @param club_id The unique identifier of the club
     * @return Details of the specified club
     */
    @Operation(summary = "Get club by ID", description = "Retrieve detailed information for a club by its unique ID")

    @GetMapping("/clubs/{club_id}")
    public ResponseEntity<?> getClubById(@PathVariable int club_id) {
        return ResponseEntity.ok(clubsService.clubbyId(club_id));
    }
}
