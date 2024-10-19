package org.example.main.Clubs;// src/main/java/com/example/demo/MessageController.java
import org.springframework.http.HttpStatus;
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
}
