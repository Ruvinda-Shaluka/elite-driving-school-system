package lk.ijse.elitedrivingschoolsystemormcoursework.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.tm.UserTM;


import java.net.URL;
import java.util.ResourceBundle;

public class UserManagePageController implements Initializable {


    public TableView<UserTM> tblUser;
    public TableColumn<UserTM, String> colId;
    public TableColumn<UserTM, String> colUsername;
    public TableColumn<UserTM, String> colPassword;
    public TableColumn<UserTM, String> colRole;
    public TableColumn<UserTM, String> colEmail;
    public TableColumn<UserTM, String> colStatus;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("userId"));
        colUsername.setCellValueFactory(new PropertyValueFactory<>("userName"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void onClickTable(MouseEvent mouseEvent) {
    }
}
