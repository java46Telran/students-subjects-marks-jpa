package telran.spring.data.service;

import telran.spring.data.model.*;
import telran.spring.data.proj.*;

import java.util.*;

public interface CollegeService {
	void addStudent(Student student);
	void addSubject(Subject subject);
	void addMark(Mark mark);
	List<MarkProj> getMarksByNameSubject(String name, String subject);
	List<StudentSubjectMark> getMarksByName(String name);
}
