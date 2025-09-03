package lk.ijse.elitedrivingschoolsystemormcoursework.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class PaymentsDTO {
    private String paymentId;
    private String studentId;
    private String paymentDate;
    private double amount;
    private String paymentMethod;
    private String status;
}
