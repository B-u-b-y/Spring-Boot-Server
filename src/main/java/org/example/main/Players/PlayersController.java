package org.example.main.Players;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Tag(name = "Players", description = "API for retrieving player information")
public class PlayersController {

    private final PlayersService playersService;

    public PlayersController(PlayersService playersService) {
        this.playersService = playersService;
    }

    /**
     * Get players by club
     * @param club The club identifier
     * @return List of players in the specified club
     */
    @Operation(
            summary = "Get Players by Club",
            description = "Retrieve a list of players associated with the specified club",
            parameters = @Parameter(
                    name = "club",
                    description = "The ID of the club to get players for",
                    required = true,
                    example = "1"
            ))
    @GetMapping("/{club}/players")    public ResponseEntity<?> getPlayersByClub(@PathVariable int club) {
        return ResponseEntity.ok(playersService.playerbyClub(club));
    }

    /**
     * Get player details by player ID
     * @param player_id The player identifier
     * @return Player details based on player ID
     */
    @Operation(
            summary = "Get Player by ID",
            description = "Retrieve player details by their unique ID",
            parameters = @Parameter(
                    name = "player_id",
                    description = "The ID of the player to retrieve details for",
                    required = true,
                    example = "23"
            ))
    @GetMapping("/players/{player_id}")    public ResponseEntity<?> getPlayerById(@PathVariable int player_id) {
        return ResponseEntity.ok(playersService.playerbyId(player_id));
    }
}