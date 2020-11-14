package sample;

import javafx.collections.*;
import javafx.concurrent.*;

/**
 * Created by Gabriel on 14/11/2020
 */

public class EmployeeService extends Service<ObservableList<String>> {
    @Override
    protected Task<ObservableList<String>> createTask() {
        return new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {
                        "Gabriel Molocea",
                        "Biil Gats",
                        "Marian Molocea",
                        "Adrew Tosk",
                        "Steave Hacks",
                        "Tim Johns"};
    
                ObservableList<String> employees = FXCollections.observableArrayList();
    
                for (int i = 0; i < 6; i++) {
                    employees.add(names[i]);
                    updateMessage("Added " + names[i] + " to the list");
                    updateProgress(i+1,6);
        
                    Thread.sleep(200);
                }
                return employees;
            }
        };
    }
}
