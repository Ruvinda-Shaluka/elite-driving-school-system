package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.InstructorsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.InstructorsDTO;

import java.util.List;
import java.util.Optional;

public class InstructorsBOImpl implements InstructorsBO {
    @Override
    public List<InstructorsDTO> getAllInstructors() throws Exception {
        return List.of();
    }

    @Override
    public String getLastInstructorId() throws Exception {
        return "";
    }

    @Override
    public boolean saveInstructors(InstructorsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updateInstructors(InstructorsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deleteInstructors(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllInstructorIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<InstructorsDTO> findByInstructorId(String id) throws Exception {
        return Optional.empty();
    }
}
