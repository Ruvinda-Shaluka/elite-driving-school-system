module lk.ijse.elitedrivingschoolsystemormcoursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires static lombok;
    requires java.sql;


    opens lk.ijse.elitedrivingschoolsystemormcoursework to javafx.fxml;
    exports lk.ijse.elitedrivingschoolsystemormcoursework;
}