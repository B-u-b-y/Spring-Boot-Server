package org.example.main.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByName(username);

        System.out.println("User auhtentication: " + (user != null && password.equals(user.getPassword())));
        // Validate if user exists and password matches
        return user != null && password.equals(user.getPassword());
    }

    public boolean register(String username, String password) {
        // Check if user already exists
        if (userRepository.findByName(username) != null) {
            return false;
        }

        // Create new user
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Save user to database
        userRepository.save(user);

        return true;
    }
}
