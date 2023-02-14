package telran.spring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import telran.spring.data.model.Mark;
import telran.spring.data.model.Student;
import telran.spring.data.model.Subject;
import telran.spring.data.service.CollegeService;

@Component
public class RandomDbCreation {
	@Autowired
CollegeService collegeService;
	@PostConstruct
	void dbCreation() {
		collegeService.addStudent(new Student(1, "Vasya"));
		collegeService.addSubject(new Subject(1, "Java"));
		collegeService.addMark(new Mark(1, 1, 95));
	}
}
