package edu.miu.cs545.alumnimanagementportal.repository;

import edu.miu.cs545.alumnimanagementportal.entiteis.JobOpportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOpportunityRepository extends JpaRepository<JobOpportunity, Long> {
}
