package com.example.khaosat;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HelloController {
    @FXML
    ToggleGroup sex;
    @FXML
    VBox survey;
    @FXML
    TextField name;
    @FXML
    RadioButton male;
    @FXML
    RadioButton female;
    @FXML
    RadioButton other;
    @FXML
    TextField age;
    @FXML
    TextField address;

    @FXML

    protected void saveInfo() {
        String surveyData = String.valueOf(survey);
        try {
            FileWriter fileWriter = new FileWriter(new File("data.txt"));
            RadioButton selected = (RadioButton) sex.getSelectedToggle();
            fileWriter.write(name.getText() + "\n");
            fileWriter.write(selected.getText()+ "\n");
            fileWriter.write(age.getText()+ "\n");
            fileWriter.write(address.getText()+ "\n");

            fileWriter.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Done");
            alert.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}