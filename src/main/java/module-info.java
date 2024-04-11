module org.example.johsmith_comp228lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.johsmith_comp228lab6 to javafx.fxml;
    exports org.example.johsmith_comp228lab6;
}