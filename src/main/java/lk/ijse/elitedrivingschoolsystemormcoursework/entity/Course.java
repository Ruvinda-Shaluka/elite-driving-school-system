package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Course {
    private String course_id;
    private String course_name;
    private String duration;
    private double fee;
    private String description;
    private String instructor_id;
}
