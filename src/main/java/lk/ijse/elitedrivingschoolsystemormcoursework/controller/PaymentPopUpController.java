package lk.ijse.elitedrivingschoolsystemormcoursework.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOFactory;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOTypes;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.PaymentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.PaymentsDTO;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class PaymentPopUpController implements Initializable {

    public TextField txtPaymentDate;
    public TextField txtAmount;
    public ComboBox cmbPaymentMethod;
    public TextField txtStatus;
    public TextField txtStudentId;
    public Button btnSave;
    public Button btnUpdate;
    public Label lblPaymentId;

    private final StudentsBO studentsBO = (StudentsBO) BOFactory.getInstance().getBO(BOTypes.STUDENTS);
    private final PaymentsBO paymentsBO = (PaymentsBO) BOFactory.getInstance().getBO(BOTypes.PAYMENTS);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            lblPaymentId.setText(paymentsBO.generateNewPaymentId());
            cmbPaymentMethod.setItems(FXCollections.observableArrayList(studentsBO.getAllStudentIds()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void btnSaveOncAction(ActionEvent actionEvent) {
        String paymentId = lblPaymentId.getText();
        String paymentDate = txtPaymentDate.getText();
        double amount = Double.parseDouble(txtAmount.getText());
        String paymentMethod = String.valueOf(cmbPaymentMethod.getValue());
        String status = txtStatus.getText();
        String studentId = txtStudentId.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(paymentDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (paymentId.isEmpty() || paymentDate.isEmpty() || txtAmount.getText().isEmpty() || paymentMethod.isEmpty() || status.isEmpty()|| studentId.isEmpty()) {
            btnSave.setDisable(true);
            btnUpdate.setDisable(true);
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        try {
            boolean isSaved = paymentsBO.savePayments(new PaymentsDTO(
                    paymentId,
                    date,
                    amount,
                    paymentMethod,
                    status,
                    studentId
                    ));

            if (isSaved) {
                new Alert(Alert.AlertType.INFORMATION, "Payment saved successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to save payment").show();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String paymentId = lblPaymentId.getText();
        String paymentDate = txtPaymentDate.getText();
        double amount = Double.parseDouble(txtAmount.getText());
        String paymentMethod = String.valueOf(cmbPaymentMethod.getValue());
        String status = txtStatus.getText();
        String studentId = txtStudentId.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(paymentDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (paymentId.isEmpty() || paymentDate.isEmpty() || txtAmount.getText().isEmpty() || paymentMethod.isEmpty() || status.isEmpty()|| studentId.isEmpty()) {
            btnSave.setDisable(true);
            btnUpdate.setDisable(true);
            new Alert(Alert.AlertType.ERROR, "Please fill all the fields").show();
            return;
        }

        try {
            boolean isSaved = paymentsBO.updatePayments(new PaymentsDTO(
                    paymentId,
                    date,
                    amount,
                    paymentMethod,
                    status,
                    studentId
            ));

            if (isSaved) {
                new Alert(Alert.AlertType.INFORMATION, "Payment updated successfully").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Failed to update payment").show();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
