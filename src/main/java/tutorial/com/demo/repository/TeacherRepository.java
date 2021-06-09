package tutorial.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.com.demo.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
