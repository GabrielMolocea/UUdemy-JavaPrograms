package sample;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.scene.web.*;
import javafx.stage.*;

import java.io.*;
import java.util.*;


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
    private WebView webView;
    
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
//        DirectoryChooser chooser = new DirectoryChooser();
       
        FileChooser chooser = new FileChooser();
//        chooser.showOpenDialog(grindPane.getScene().getWindow());
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Zip","*.zip"),
                new FileChooser.ExtensionFilter("PDF","*.pdf"),
                new FileChooser.ExtensionFilter("Text","*.txt"),
                new FileChooser.ExtensionFilter("All Files","*.*")
        );
        List<File> file =  chooser.showOpenMultipleDialog(grindPane.getScene().getWindow());
        if (file !=null) {
            for (int i = 0; i< file.size(); i++){
                System.out.println(file.get(i));
            }
//            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }
    
    @FXML
    public void handleLinkedClick() {
//       try {
//           Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//       } catch (URISyntaxException | IOException e) {
//           e.printStackTrace();
//       }
        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    
    
    }
    
}
