package com.gabriel.todolist;

import com.gabriel.todolist.datamodel.TodoData;
import com.gabriel.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
   
    private List<TodoItem> todoItems;
    
    @FXML
    private ListView<TodoItem> todoListView;
    
    @FXML
    private TextArea itemDetailsTextArea;
    
    @FXML
    private Label deadLineLabel;
    
    public void initialize(){
//        TodoItem item1 = new TodoItem("Buy groceries","Buy missing groceries from home",
//                LocalDate.of(2020, Month.OCTOBER, 29));
//        TodoItem item2 = new TodoItem("Doctor's Appointment","See Doctor bring paperwork",
//                LocalDate.of(2020, Month.SEPTEMBER, 5));
//        TodoItem item3 = new TodoItem("Enroll in language class","I need to learn more languages",
//                LocalDate.of(2020, Month.SEPTEMBER, 29));
//        TodoItem item4 = new TodoItem("Pickup Mail","Mail's arriving Oct.15",
//                LocalDate.of(2020, Month.OCTOBER, 15));
//        TodoItem item5 = new TodoItem("Cook food","Need to cook food for the week",
//                LocalDate.of(2020, Month.OCTOBER, 28));
//        todoItems = new ArrayList<>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setTodoItems(todoItems);
        
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observable, TodoItem oldValue, TodoItem newValue) {
                if (newValue != null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df =  DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadLineLabel.setText(df.format(item.getDeadLine()));
                    
                }
            }
        });
        
        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        todoListView.getSelectionModel().selectFirst();
    }
    
    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadLine().toString());
//        System.out.println("The selected item is " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadLine().toString());
//        itemDetailsTextArea.setText(sb.toString());
    }
}
