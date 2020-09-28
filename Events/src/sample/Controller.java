package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    //Added FXML to Controller
    @FXML// Mandatory @FXML to communicate to fxml
    private TextField nameFiled;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    
    
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    
    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameFiled.getText());
        } else if (e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameFiled.getText());
        }
        
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException event){
//            //We don't care about this
//        }
        if (ourCheckBox.isSelected()){
            nameFiled.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }
    
    @FXML
    public void handleKeyReleased(){
        String text = nameFiled.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }
    
    public void handleChange(){
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
