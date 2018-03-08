package fi.duong.demo.dao;

import fi.duong.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("MongoDbDao")
public class MongoDBStudentDaoImpl implements StudentDao{

    //private final MongoDoTemplate mongoDoTemplate;

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(UUID.randomUUID(), 10, "Jack", "Johnson"
        ,"CS"));
        return students;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}
