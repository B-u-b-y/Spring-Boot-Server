package org.example.main.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Tag(name = "User", description = "API for user authentication and registration")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Authenticate the user based on login credentials
     * @param loginRequest The login request containing username and password
     * @return Login response with success message
     */
    @Operation(summary = "User Login", description = "Authenticate the user by checking the provided credentials")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = userService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        if (isAuthenticated) {
            return ResponseEntity.ok(new LoginResponse("Login successful", true));
        } else {
            return ResponseEntity.ok(new LoginResponse("Login failed", false));
        }
    }

    /**
     * Register a new user
     * @param loginRequest The registration request containing username and password
     * @return Registration response with success message
     */
    @Operation(summary = "User Registration", description = "Register a new user by providing username and password")
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody LoginRequest loginRequest) {
        boolean isRegistered = userService.register(loginRequest.getUsername(), loginRequest.getPassword());

        if (isRegistered) {
            return ResponseEntity.ok(new LoginResponse("Registration successful", true));
        } else {
            return ResponseEntity.ok(new LoginResponse("Registration failed", false));
        }
    }
}

class LoginRequest {
    private String username;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

class LoginResponse {

    private String message;
    private boolean success;

    public LoginResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
