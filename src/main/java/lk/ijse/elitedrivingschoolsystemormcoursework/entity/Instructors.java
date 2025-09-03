package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

@Table(name = "instructors")
public class Instructors {

    @Id
    @Column
    private String instructor_id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false,unique = true,length = 15)
    private String phone;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private String availability;
}
