package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Instructors {
    private String instructor_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String specialization;
    private String availability;
}
