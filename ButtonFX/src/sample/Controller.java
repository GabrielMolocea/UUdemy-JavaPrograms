package sample;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button clickMeButton;
    
    public void initialize() {
        clickMeButton.setOnAction( event -> System.out.println("You clicked me"));
    }
}
