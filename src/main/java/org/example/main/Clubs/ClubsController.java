package org.example.main.Clubs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ClubsController {

    private final ClubsService clubsService;

    public ClubsController(ClubsService clubsService) {
        this.clubsService = clubsService;
    }

    @GetMapping("/{competition}/clubs")
    public ResponseEntity<?> getClubsByCountry(@PathVariable String competition) {

        return ResponseEntity.ok(clubsService.clubbyCompetition(competition));
    }

    @GetMapping("/clubs/{club_id}")
    public ResponseEntity<?> getClubById(@PathVariable int club_id) {
        return ResponseEntity.ok(clubsService.clubbyId(club_id));
    }
}
