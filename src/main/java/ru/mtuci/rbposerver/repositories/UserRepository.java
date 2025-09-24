package ru.mtuci.rbposerver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.rbposerver.entities.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByLogin(String login);
    User getUserById(Long id);

    boolean existsByLogin(String login);
    boolean existsByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
