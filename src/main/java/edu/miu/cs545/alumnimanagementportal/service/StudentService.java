package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.dto.StudentDto;
import edu.miu.cs545.alumnimanagementportal.entiteis.Course;
import edu.miu.cs545.alumnimanagementportal.entiteis.Student;
import edu.miu.cs545.alumnimanagementportal.entiteis.UserProfile;
import edu.miu.cs545.alumnimanagementportal.repository.StudentRepository;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repo;


    public List<StudentDto> search(Integer graduationYear, String course, String location, String industry) {
       // var entities = repo.findAll(buildSearchSpecifications(course,location,industry, graduationYear));
        List<StudentDto> studentDtos = new ArrayList<>();
       // entities
        return studentDtos;
    }


//    private Specification<Student> buildSearchSpecifications(String course, String location, String industry, Integer graduationYear) {
//        return (root, query, criteriaBuilder) -> {
//            List<Predicate> predicates = new ArrayList<>();
//
//            if (course != null) {
//                Join<Student, Course> courseJoin = root.join("courseTaken");
//                predicates.add(criteriaBuilder.equal(courseJoin.get("name"), course));
//            }
//
//            if (location != null) {
//                predicates.add(criteriaBuilder.equal(root.get("city"), location));
//            }
//
//            if (industry != null) {
//                predicates.add(criteriaBuilder.equal(root.get("industry"), industry));
//            }
//
//            if (graduationYear > 0) {
//                predicates.add(criteriaBuilder.equal(root.get("graduationyear"), graduationYear));
//            }
//
//            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
//        };
//    }
}
