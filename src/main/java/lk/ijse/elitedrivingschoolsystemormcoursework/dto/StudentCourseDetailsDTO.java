package lk.ijse.elitedrivingschoolsystemormcoursework.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class StudentCourseDetailsDTO {
    private String studentCourseId;
    private String studentId;
    private String courseId;
    private String enrollmentDate;
    private String status;
    private String grade;
}
