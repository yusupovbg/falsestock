module com.bkhtdev.falsestock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bkhtdev.falsestock to javafx.fxml;
    exports com.bkhtdev.falsestock;
}