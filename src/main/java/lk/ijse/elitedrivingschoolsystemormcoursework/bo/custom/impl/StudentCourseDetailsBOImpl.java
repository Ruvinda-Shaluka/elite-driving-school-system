package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentCourseDetailsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.exception.DuplicateException;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.exception.NotFoundException;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.util.EntityDTOConverter;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.DAOFactory;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.DAOTypes;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.CourseDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.StudentCourseDetailsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.StudentsDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.StudentCourseDetailsDTO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Course;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.StudentCourseDetails;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentCourseDetailsBOImpl implements StudentCourseDetailsBO {

    private final StudentCourseDetailsDAO studentCourseDetailsDAO = (StudentCourseDetailsDAO) DAOFactory.getInstance().getDAO(DAOTypes.STUDENT_COURSE_DETAILS);
    private final StudentsDAO studentsDAO =(StudentsDAO) DAOFactory.getInstance().getDAO(DAOTypes.STUDENTS);
    private final CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOTypes.COURSE);
    private final EntityDTOConverter converter = new EntityDTOConverter();

    @Override
    public List<StudentCourseDetailsDTO> getAllStudentCourseDetails() throws Exception {
        List<StudentCourseDetails> studentCourseDetails = studentCourseDetailsDAO.getAll();
        List<StudentCourseDetailsDTO> studentCourseDetailsDTOs = new ArrayList<>();
        for (StudentCourseDetails details : studentCourseDetails) {
            studentCourseDetailsDTOs.add(converter.getStudentCourseDetailsDTO(details));
        }
        return studentCourseDetailsDTOs;
    }

    @Override
    public String getLastStudentCourseDetailId() throws Exception {
        return studentCourseDetailsDAO.getLastId();
    }

    @Override
    public boolean saveStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception {
        Optional<Students> studentExist = studentsDAO.findById(t.getStudentId());
        Optional<Course> courseExist = courseDAO.findById(t.getCourseId());
        Optional<StudentCourseDetails> detailsExist = studentCourseDetailsDAO.findById(t.getStudentCourseId());

        if (detailsExist.isPresent()) {
            throw new DuplicateException("Student Course details already exists");
        }

        if (studentExist.isPresent() && courseExist.isPresent()) {
            return studentCourseDetailsDAO.save(converter.getStudentCourseDetailsEntity(t));
        }
        throw new NotFoundException("Course or Student not found");

    }

    @Override
    public boolean updateStudentCourseDetails(StudentCourseDetailsDTO t) throws Exception {
        Optional<StudentCourseDetails> detailsExists = studentCourseDetailsDAO.findById(t.getStudentCourseId());

        if (detailsExists.isPresent()) {
            return studentCourseDetailsDAO.update(converter.getStudentCourseDetailsEntity(t));
        }
        throw new NotFoundException("StudentCourseDetails not found");
    }

    @Override
    public boolean deleteStudentCourseDetails(String id) throws Exception {
        Optional<StudentCourseDetails> detailsExists = studentCourseDetailsDAO.findById(id);

        if (detailsExists.isPresent()) {
            return studentCourseDetailsDAO.delete(id);
        }
        throw new NotFoundException("StudentCourseDetails not found");
    }

    @Override
    public List<String> getAllStudentCourseDetailIds() throws Exception {
        return studentCourseDetailsDAO.getAllIds();
    }

    @Override
    public Optional<StudentCourseDetailsDTO> findByStudentCourseDetailId(String id) throws Exception {
        Optional<StudentCourseDetails> details = studentCourseDetailsDAO.findById(id);
        if (details.isPresent()) {
            return Optional.of(converter.getStudentCourseDetailsDTO(details.get()));
        } else {
            return Optional.empty();
        }
    }
}
