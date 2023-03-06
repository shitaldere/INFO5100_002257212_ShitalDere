package com.example.jvjv;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private TextField textField = new TextField();
    private long num1 = 0;
    private String op= "";
    private boolean start = true;
    @Override
    public void start(Stage stage) throws IOException {
      textField.setFont (Font.font(20));
      textField.setPrefHeight(50);
      textField.setAlignment(Pos.CENTER_RIGHT);
      textField.setEditable(false);

        StackPane stackpane = new StackPane();
        stackpane.setPadding(new Insets(10));
        stackpane.getChildren().add(textField);


        TilePane tile = new TilePane();
        tile.setHgap(10);
        tile.setVgap(10);
        tile.setAlignment(Pos.TOP_CENTER);
        tile.getChildren().addAll(
                createButtonForNumber("7"),
                createButtonForNumber("8"),
                createButtonForNumber("9"),
                createButtonForOperators("/"),

                createButtonForNumber("4"),
                createButtonForNumber("5"),
                createButtonForNumber("6"),
                createButtonForOperators("*"),

                createButtonForNumber("1"),
                createButtonForNumber("2"),
                createButtonForNumber("3"),
                createButtonForOperators("-"),

                createButtonForNumber("0"),
                createButtonForClear("C"),
                createButtonForOperators("="),
                createButtonForOperators("+")

        );


        BorderPane borderpane = new BorderPane();
        Parent root = null;
        borderpane.setTop(stackpane);
        borderpane.setCenter(tile);
        Scene scene = new Scene(borderpane, 250,320);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.show();

    }

      private Button createButtonForNumber(String ch){
        Button button = new Button(ch);
        button.setFont(Font.font(20));
        button.setPrefSize(45,45);
        button.setOnAction(this::processNumber);

        return button;
      }
    private Button createButtonForOperators(String ch){
        Button button = new Button(ch);
        button.setFont(Font.font(20));
        button.setPrefSize(45,45);
        button.setOnAction(this::processOperator);
        return button;
    }
    private Button createButtonForClear(String ch){
        Button button = new Button(ch);
        button.setPrefSize(50,50);
        button.setOnAction(e->{
         textField.setText("");
         op="";
         start= true;
        });
        return button;
    }

    private void processNumber(ActionEvent e){
     if (start){
         textField.setText("");
         start = false;
     }
     String value = ((Button)e.getSource()).getText();
     textField.setText(textField.getText() + value);
    }
    private void processOperator(ActionEvent e){
        String value = ((Button)e.getSource()).getText();
       if(!value.equals("=")){
          if(!op.isEmpty())
              return;
          num1=Long.parseLong(textField.getText());
          op=value;
          textField.setText("");
       }else {
           if(op.isEmpty())
               return;
           long num2=Long.parseLong(textField.getText());
           float result =calculate( num1,num2,op);
           textField.setText(String.valueOf(result));
           start =true;
           op="";
    }
    }
    private float calculate(long num1,long num2,String operator){

        switch (operator){
            case "+": return num1+num2 ;
            case "-": return num1-num2 ;
            case "*": return num1*num2 ;
            case "/":
                if(2==0) return 0;
                else {return num1/num2 ;}
            default:return 0;
        }
    }
    public static void main(String[] args) {
        launch();
    }
}