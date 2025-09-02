module lk.ijse.elitedrivingschoolsystemormcoursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;


    opens lk.ijse.elitedrivingschoolsystemormcoursework to javafx.fxml;
    exports lk.ijse.elitedrivingschoolsystemormcoursework;
}