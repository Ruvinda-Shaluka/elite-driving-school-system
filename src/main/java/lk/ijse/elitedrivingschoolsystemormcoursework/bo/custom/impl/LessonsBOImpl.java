package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.LessonsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.LessonsDTO;

import java.util.List;
import java.util.Optional;

public class LessonsBOImpl implements LessonsBO {
    @Override
    public List<LessonsDTO> getAllLessons() throws Exception {
        return List.of();
    }

    @Override
    public String getLastLessonId() throws Exception {
        return "";
    }

    @Override
    public boolean saveLessons(LessonsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updateLessons(LessonsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deleteLessons(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllLessonIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<LessonsDTO> findByLessonId(String id) throws Exception {
        return Optional.empty();
    }
}
