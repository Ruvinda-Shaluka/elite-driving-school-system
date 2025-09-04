package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.CourseDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.StudentsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Course;

import java.util.List;
import java.util.Optional;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public List<Course> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(Course course) throws Exception {
        return false;
    }

    @Override
    public boolean update(Course course) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<Course> findById(String id) throws Exception {
        return Optional.empty();
    }
}
