package sample;

import javafx.application.*;
import javafx.collections.*;
import javafx.concurrent.*;
import javafx.fxml.*;
import javafx.scene.control.ListView;


public class Controller {

    private Task<ObservableList<String>> task;
    
    @FXML
    private ListView listView;
    
    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                ObservableList<String> employees = FXCollections.observableArrayList(
                        "Gabriel Molocea",
                        "Biil Gats",
                        "Marian Molocea",
                        "Adrew Tosk",
                        "Steave Hacks",
                        "Tim Johns");
                return employees;
            }
        };
        
        listView.itemsProperty().bind(task.valueProperty());
    }
    
    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
