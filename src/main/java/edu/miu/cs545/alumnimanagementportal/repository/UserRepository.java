package edu.miu.cs545.alumnimanagementportal.repository;

import edu.miu.cs545.alumnimanagementportal.entiteis.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
