package lk.ijse.elitedrivingschoolsystemormcoursework.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Payments {
    private String paymentId;
    private String studentId;
    private Date paymentDate;
    private double amount;
    private String paymentMethod;
    private String status;
}
