module com.example.assignment1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment1javafx to javafx.fxml;
    exports com.example.assignment1javafx;
}