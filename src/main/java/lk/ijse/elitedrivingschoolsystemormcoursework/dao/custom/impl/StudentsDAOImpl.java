package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.StudentsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Students;

import java.util.List;
import java.util.Optional;

public class StudentsDAOImpl implements StudentsDAO {
    @Override
    public List<Students> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(Students students) throws Exception {
        return false;
    }

    @Override
    public boolean update(Students students) throws Exception {
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
    public Optional<Students> findById(String id) throws Exception {
        return Optional.empty();
    }
}
