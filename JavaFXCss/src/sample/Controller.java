package sample;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.io.*;


public class Controller {
    
    @FXML
    private GridPane grindPane;
    
    @FXML
    private Label label;
    
    @FXML
    private Button button4;
    
    public void initialize() {
        button4.setEffect(new DropShadow());
    }
    
    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }
    
    @FXML
    public void  handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }
    @FXML
    public void handleClick() {
        DirectoryChooser chooser = new DirectoryChooser();
       
//        FileChooser chooser = new FileChooser();
//        chooser.showOpenDialog(grindPane.getScene().getWindow());
        
        File file =  chooser.showDialog(grindPane.getScene().getWindow());
        if (file !=null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }
    
}
