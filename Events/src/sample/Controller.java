package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    //Added FXML to Controller
    @FXML// Mandatory @FXML to communicate to fxml
    private TextField nameFiled;
    
    @FXML
    public void onButtonClicked(){
        System.out.println("Hello, " + nameFiled.getText());
    }
}
