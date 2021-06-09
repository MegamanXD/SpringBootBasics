package tutorial.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.com.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
