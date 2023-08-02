package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.entiteis.Course;
import edu.miu.cs545.alumnimanagementportal.entiteis.Student;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class StudentSpecification implements Specification<Student> {


    private String course;
    private String location;
    private String industry;
    private Integer graduationYear;

    public StudentSpecification(String course, String location, String industry, Integer graduationYear) {
        this.course = course;
        this.location = location;
        this.industry = industry;
        this.graduationYear = graduationYear;
    }

    @Override
    public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (course != null) {
            Join<Student, Course> courseJoin = root.join("courseTaken");
            predicates.add(criteriaBuilder.equal(courseJoin.get("name"), course));
        }

        if (location != null) {
            predicates.add(criteriaBuilder.equal(root.get("city"), location));
        }

        if (industry != null) {
            predicates.add(criteriaBuilder.equal(root.get("industry"), industry));
        }

        if (graduationYear > 0) {
            predicates.add(criteriaBuilder.equal(root.get("graduationyear"), graduationYear));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

    }
}
