package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.UserDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.StudentCourseDetails;

import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAO {
    @Override
    public List<StudentCourseDetails> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(StudentCourseDetails studentCourseDetails) throws Exception {
        return false;
    }

    @Override
    public boolean update(StudentCourseDetails studentCourseDetails) throws Exception {
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
    public Optional<StudentCourseDetails> findById(String id) throws Exception {
        return Optional.empty();
    }
}
