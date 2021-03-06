package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;

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
    private Label ourLabel;
    
    
    
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
        
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "Ui Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "Ui Thread" : "Background Thread";
                            System.out.println("I'm  updating the label on the : " + s);
                            ourLabel.setText("We did something");
                        }
                    });
                } catch (InterruptedException event){
                    //We don't care about this
                }
            }
        };
        
        new Thread(task).start();
       
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
