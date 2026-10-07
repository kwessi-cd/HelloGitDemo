module edu.utsa.cs3443.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.gitdemo to javafx.fxml;
    exports edu.utsa.cs3443.gitdemo;
}