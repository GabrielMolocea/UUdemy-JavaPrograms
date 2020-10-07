package sample;

import javafx.fxml.*;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Label label;
    @FXML
    public void handleAction() {
         label.setText("OK Button Pressed");
     }
}
