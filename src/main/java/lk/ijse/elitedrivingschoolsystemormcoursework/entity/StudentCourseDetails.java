package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "student_course_details")
public class StudentCourseDetails {

    @Id
    @Column
    private String studentCourseId;

    @Column
    private String studentId;

    @Column
    private String courseId;

    @Column
    private Date enrollmentDate;

    @Column
    private String status;

    @Column
    private String grade;
}
