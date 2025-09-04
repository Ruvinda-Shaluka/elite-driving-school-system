package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.InstructorsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Instructors;

import java.util.List;
import java.util.Optional;

public class InstructorsDAOImpl implements InstructorsDAO {
    @Override
    public List<Instructors> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(Instructors instructors) throws Exception {
        return false;
    }

    @Override
    public boolean update(Instructors instructors) throws Exception {
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
    public Optional<Instructors> findById(String id) throws Exception {
        return Optional.empty();
    }
}
