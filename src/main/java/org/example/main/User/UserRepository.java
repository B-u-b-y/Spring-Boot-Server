package org.example.main.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = :name")
    User findByName(@Param("name") String name);

    @Query("INSERT INTO User (username, password) VALUES (:username, :password)")
    void save(@Param("username") String username, @Param("password") String password);
}
