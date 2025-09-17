package lk.ijse.elitedrivingschoolsystemormcoursework.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOFactory;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOTypes;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.CourseBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.InstructorsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.LessonsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.LessonsDTO;

import java.net.URL;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class LessonsPopUpController implements Initializable {

    private final LessonsBO lessonsBO = (LessonsBO) BOFactory.getInstance().getBO(BOTypes.LESSONS);
    private final StudentsBO studentBO = (StudentsBO) BOFactory.getInstance().getBO(BOTypes.STUDENTS);
    private final CourseBO courseBO = (CourseBO) BOFactory.getInstance().getBO(BOTypes.COURSE);
    private final InstructorsBO instructorsBO = (InstructorsBO) BOFactory.getInstance().getBO(BOTypes.INSTRUCTORS);

    public TextField txtLessonDate;
    public TextField txtStartTime;
    public TextField txtEndTime;
    public TextField txtStatus;
    public ComboBox cmbStudentId;
    public ComboBox cmbCourseId;
    public ComboBox cmbInstructorId;
    public Button btnSave;
    public Button btnUpdate;
    public Label lblLessonId;


    public void btnSaveOncAction(ActionEvent actionEvent) {
        String lessonId = lblLessonId.getText();
        String lessonDateStr = txtLessonDate.getText();
        String startTimeStr = txtStartTime.getText();
        String endTimeStr = txtEndTime.getText();
        String status = txtStatus.getText();
        String studentId = cmbStudentId.getValue() != null ? cmbStudentId.getValue().toString() : "";
        String courseId = cmbCourseId.getValue() != null ? cmbCourseId.getValue().toString() : "";
        String instructorId = cmbInstructorId.getValue() != null ? cmbInstructorId.getValue().toString() : "";

        if (lessonId.isEmpty() || lessonDateStr.isEmpty() || startTimeStr.isEmpty() || endTimeStr.isEmpty() ||
                status.isEmpty() || studentId.isEmpty() || courseId.isEmpty() || instructorId.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

            Date lessonDate = dateFormat.parse(lessonDateStr);
            Date startTime = timeFormat.parse(startTimeStr);
            Date endTime = timeFormat.parse(endTimeStr);

            boolean isSaved = lessonsBO.saveLessons(new LessonsDTO(
                    lessonId, studentId, courseId, instructorId, lessonDate, (Time) startTime, (Time) endTime, status
            ));
            if (isSaved) {
                new Alert(Alert.AlertType.INFORMATION, "Lesson saved successfully!").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to save lesson!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error: " + e.getMessage()).show();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String lessonId = lblLessonId.getText();
        String lessonDateStr = txtLessonDate.getText();
        String startTimeStr = txtStartTime.getText();
        String endTimeStr = txtEndTime.getText();
        String status = txtStatus.getText();
        String studentId = cmbStudentId.getValue() != null ? cmbStudentId.getValue().toString() : "";
        String courseId = cmbCourseId.getValue() != null ? cmbCourseId.getValue().toString() : "";
        String instructorId = cmbInstructorId.getValue() != null ? cmbInstructorId.getValue().toString() : "";

        if (lessonId.isEmpty() || lessonDateStr.isEmpty() || startTimeStr.isEmpty() || endTimeStr.isEmpty() ||
                status.isEmpty() || studentId.isEmpty() || courseId.isEmpty() || instructorId.isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

            Date lessonDate = dateFormat.parse(lessonDateStr);
            Date startTime = timeFormat.parse(startTimeStr);
            Date endTime = timeFormat.parse(endTimeStr);

            boolean isUpdated = lessonsBO.updateLessons(new LessonsDTO(
                    lessonId, studentId, courseId, instructorId, lessonDate, (Time) startTime, (Time) endTime, status
            ));
            if (isUpdated) {
                new Alert(Alert.AlertType.INFORMATION, "Lesson updated successfully!").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to update lesson!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error: " + e.getMessage()).show();
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            lblLessonId.setText(lessonsBO.generateNewLessonId());
            cmbStudentId.setItems(FXCollections.observableArrayList(studentBO.getAllStudentIds()));
            cmbCourseId.setItems(FXCollections.observableArrayList(courseBO.getAllCourses()));
            cmbInstructorId.setItems(FXCollections.observableArrayList(instructorsBO.getAllInstructors()));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
