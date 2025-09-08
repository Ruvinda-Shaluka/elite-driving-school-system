package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.CourseBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.CourseDTO;

import java.util.List;
import java.util.Optional;

public class CourseBOImpl implements CourseBO {
    @Override
    public List<CourseDTO> getAllCourses() throws Exception {
        return List.of();
    }

    @Override
    public String getLastCourseId() throws Exception {
        return "";
    }

    @Override
    public boolean saveCourses(CourseDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updateCourses(CourseDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCourses(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllCourseIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<CourseDTO> findByCourseId(String id) throws Exception {
        return Optional.empty();
    }
}
