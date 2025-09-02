package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import lombok.*;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Lessons {
    private String lessonId;
    private String studentId;
    private String courseId;
    private String instructorId;
    private Date lessonDate;
    private Time startTime;
    private Time endTime;
    private String status;
}
