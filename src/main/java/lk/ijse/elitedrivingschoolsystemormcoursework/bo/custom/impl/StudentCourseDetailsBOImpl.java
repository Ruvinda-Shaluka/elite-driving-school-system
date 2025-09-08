package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentCourseDetailsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.StudentCourseDetailsDTO;

import java.util.List;
import java.util.Optional;

public class StudentCourseDetailsBOImpl implements StudentCourseDetailsBO {
    @Override
    public List<StudentCourseDetailsDTO> getAllStudentCourseDetails() throws Exception {
        return List.of();
    }

    @Override
    public String getLastStudentCourseDetailId() throws Exception {
        return "";
    }

    @Override
    public boolean saveStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updateStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudentCourseDetails(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllStudentCourseDetailIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<StudentCourseDetailsDTO> findByStudentCourseDetailId(String id) throws Exception {
        return Optional.empty();
    }
}
