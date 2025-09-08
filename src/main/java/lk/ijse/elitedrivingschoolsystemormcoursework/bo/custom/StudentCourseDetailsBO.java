package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.StudentCourseDetailsDTO;


import java.util.List;
import java.util.Optional;

public interface StudentCourseDetailsBO extends SuperBO {
    List<StudentCourseDetailsDTO> getAllStudentCourseDetails() throws Exception;

    String getLastStudentCourseDetailId() throws Exception;

    boolean saveStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception;

    boolean updateStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception;

    boolean deleteStudentCourseDetails(String id) throws Exception;

    List<String> getAllStudentCourseDetailIds() throws Exception;

    Optional<StudentCourseDetailsDTO> findByStudentCourseDetailId(String id) throws Exception;
}
