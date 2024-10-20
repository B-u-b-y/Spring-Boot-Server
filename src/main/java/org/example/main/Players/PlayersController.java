package org.example.main.Players;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlayersController {

    private final PlayersService playersService;

    public PlayersController(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("/{club}/players")
    public ResponseEntity<?> getPlayersByClub(@PathVariable int club) {
        return ResponseEntity.ok(playersService.playerbyClub(club));
    }

    @GetMapping("/players/{player_id}")
    public ResponseEntity<?> getPlayerById(@PathVariable int player_id) {
        return ResponseEntity.ok(playersService.playerbyId(player_id));
    }



}
