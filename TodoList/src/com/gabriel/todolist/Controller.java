package com.gabriel.todolist;

import com.gabriel.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
   
    private List<TodoItem> todoItems;
    
    @FXML
    private ListView<TodoItem> todoListView;
    
    @FXML
    private TextArea itemDetailsTextArea;
    
    public void initialize(){
        TodoItem item1 = new TodoItem("Buy groceries","Buy missing groceries from home",
                LocalDate.of(2020, Month.OCTOBER, 29));
        TodoItem item2 = new TodoItem("Doctor's Appointment","See Doctor bring paperwork",
                LocalDate.of(2020, Month.SEPTEMBER, 5));
        TodoItem item3 = new TodoItem("Enroll in language class","I need to learn more languages",
                LocalDate.of(2020, Month.SEPTEMBER, 29));
        TodoItem item4 = new TodoItem("Pickup Mail","Mail's arriving Oct.15",
                LocalDate.of(2020, Month.OCTOBER, 15));
        TodoItem item5 = new TodoItem("Cook food","Need to cook food for the week",
                LocalDate.of(2020, Month.OCTOBER, 28));
        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    
        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    
    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is " + item);
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadLine().toString());
        itemDetailsTextArea.setText(sb.toString());
    }
}
