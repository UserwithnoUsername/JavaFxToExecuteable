module com.worstcode.creationkit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.worstcode.creationkit to javafx.fxml;
    exports com.worstcode.creationkit;
}