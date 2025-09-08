package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.StudentsDTO;

import java.util.List;
import java.util.Optional;

public class StudentsBOImpl implements StudentsBO {
    @Override
    public List<StudentsDTO> getAllUsers() throws Exception {
        return List.of();
    }

    @Override
    public String getLastStudentId() throws Exception {
        return "";
    }

    @Override
    public boolean saveStudents(StudentsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updateStudents(StudentsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudents(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllStudentIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<StudentsDTO> findByStudentId(String id) throws Exception {
        return Optional.empty();
    }
}
