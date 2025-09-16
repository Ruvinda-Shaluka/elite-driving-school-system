package lk.ijse.elitedrivingschoolsystemormcoursework.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOFactory;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.BOTypes;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.PaymentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.StudentsBO;

import java.net.URL;
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
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}
