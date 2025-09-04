package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.LessonsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Lessons;

import java.util.List;
import java.util.Optional;

public class LessonsDAOImpl implements LessonsDAO {
    @Override
    public List<Lessons> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(Lessons lessons) throws Exception {
        return false;
    }

    @Override
    public boolean update(Lessons lessons) throws Exception {
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
    public Optional<Lessons> findById(String id) throws Exception {
        return Optional.empty();
    }
}
