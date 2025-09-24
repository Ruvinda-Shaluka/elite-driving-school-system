package lk.ijse.elitedrivingschoolsystemormcoursework.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    public AnchorPane ancDashBoard;

    public void btnStudentOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/StudentManagePage.fxml");
    }

    public void btnLessonsOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/LessonsManagePage.fxml");
    }

    public void btnPaymentsOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/PaymentManagePage.fxml");
    }

    public void btnInstructorOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/InstructorsManagePage.fxml");
    }

    public void btnCourseOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/CourseManagePage.fxml");
    }

    public void btnUserOnAction(ActionEvent actionEvent) {
        navigateTo("/interfaces/view/UserManagePage.fxml");
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) {
        try {
            // Close current stage (the one with the logout button)
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.close();

            // Load the login page
            Parent root = FXMLLoader.load(getClass().getResource("/interfaces/view/LoginPage.fxml"));
            Stage loginStage = new Stage();
            loginStage.setScene(new Scene(root));
            loginStage.setTitle("Login");
            loginStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Something went wrong while logging out!").show();
        }
    }


    private void navigateTo(String path) {
        try {
            ancDashBoard.getChildren().clear();
            AnchorPane pane = FXMLLoader.load(getClass().getResource(path));
            pane.prefHeightProperty().bind(ancDashBoard.heightProperty());
            pane.prefWidthProperty().bind(ancDashBoard.widthProperty());
            ancDashBoard.getChildren().add(pane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
