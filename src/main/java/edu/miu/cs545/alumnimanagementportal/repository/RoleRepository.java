package edu.miu.cs545.alumnimanagementportal.repository;

import edu.miu.cs545.alumnimanagementportal.entiteis.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findByRole(String role);
}
