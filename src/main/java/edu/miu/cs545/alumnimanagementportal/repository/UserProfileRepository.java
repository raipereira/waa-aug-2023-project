package edu.miu.cs545.alumnimanagementportal.repository;

import edu.miu.cs545.alumnimanagementportal.entiteis.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    public Optional<UserProfile> findByUserId(Long userId);




}
