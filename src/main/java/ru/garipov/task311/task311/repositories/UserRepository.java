package ru.garipov.task311.task311.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.garipov.task311.task311.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
