package edu.miu.cs545.alumnimanagementportal.repository;

import edu.miu.cs545.alumnimanagementportal.entiteis.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
