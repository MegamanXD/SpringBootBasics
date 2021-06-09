package tutorial.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.com.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
