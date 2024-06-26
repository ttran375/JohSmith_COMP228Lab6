package org.example.johsmith_comp228lab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;

public class Main extends Application {
    private Account account;
    private ExecutorService executorService;

    @Override
    public void start(Stage primaryStage) {
        // Create an Account instance
        account = new Account(1000.0);

        // Create ExecutorService to manage threads
        executorService = Executors.newCachedThreadPool();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label depositLabel = new Label("Deposit Amount:");
        grid.add(depositLabel, 0, 0);

        TextField depositTextField = new TextField();
        grid.add(depositTextField, 1, 0);

        Label withdrawLabel = new Label("Withdraw Amount:");
        grid.add(withdrawLabel, 0, 1);

        TextField withdrawTextField = new TextField();
        grid.add(withdrawTextField, 1, 1);

        Button depositButton = new Button("Deposit");
        HBox depositBox = new HBox(10);
        depositBox.setAlignment(Pos.BOTTOM_RIGHT);
        depositBox.getChildren().add(depositButton);
        grid.add(depositBox, 1, 2);

        Button withdrawButton = new Button("Withdraw");
        HBox withdrawBox = new HBox(10);
        withdrawBox.setAlignment(Pos.BOTTOM_RIGHT);
        withdrawBox.getChildren().add(withdrawButton);
        grid.add(withdrawBox, 1, 3);

        // Event handling for buttons
        depositButton.setOnAction(e -> {
            double amount = Double.parseDouble(depositTextField.getText());
            executeTransaction("deposit", amount);
        });

        withdrawButton.setOnAction(e -> {
            double amount = Double.parseDouble(withdrawTextField.getText());
            executeTransaction("withdraw", amount);
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Account Test");
        primaryStage.show();
    }

    private void executeTransaction(String type, double amount) {
        Transaction transaction = new Transaction(account, type, amount);
        executorService.execute(transaction);
    }

    @Override
    public void stop() {
        executorService.shutdown();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
