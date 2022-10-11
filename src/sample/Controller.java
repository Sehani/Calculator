package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button enter;

    @FXML
    private Button clear;

    @FXML
    private Button sum;

    @FXML
    private Button sub;

    @FXML
    private Button mul;

    @FXML
    private Button div;

    @FXML
    private Button sin;

    @FXML
    private Button cos;

    @FXML
    private Button buttonClicked;

    @FXML
    private Button power;

    @FXML
    private Label num1;

    @FXML
    private Label num2;

    @FXML
    private TextField first;

    @FXML
    private TextField second;

    @FXML
    private TextArea screen;

    @FXML
    void buttonClicked(ActionEvent event) {
        screen.setText("");
        first.setText("");
        second.setText("");


    }

    @FXML
    void buttonDiv(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double num2=Double.parseDouble(second.getText());
        screen.setText(String.valueOf(num1/num2));

    }

    @FXML
    void buttonCos(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double calCos= Math.cos(num1);
        screen.setText(String.valueOf(calCos));

    }

    @FXML
    void buttonExp(ActionEvent event) {
        int num1=Integer.parseInt(first.getText());
        double calEx= Math.exp(num1);
        screen.setText(String.valueOf(calEx));

    }

    @FXML
    void buttonMul(ActionEvent event) {
            double num1=Double.parseDouble(first.getText());
            double num2=Double.parseDouble(second.getText());
            screen.setText(String.valueOf(num1*num2));
        }

    @FXML
    void buttonPower(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double num2=Double.parseDouble(second.getText());
        double calPo= Math.pow(num1,num2);
        screen.setText(String.valueOf(calPo));

    }

    @FXML
    void buttonSin(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double calsin= Math.sin(num1);
        screen.setText(String.valueOf(calsin));

    }

    @FXML
    void buttonSub(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double num2=Double.parseDouble(second.getText());
        screen.setText(String.valueOf(num1-num2));


    }

    @FXML
    void buttonSum(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double num2=Double.parseDouble(second.getText());
        screen.setText(String.valueOf(num1+num2));


    }

    @FXML
    void buttonTan(ActionEvent event) {
        double num1=Double.parseDouble(first.getText());
        double calTan= Math.tan(num1);
        screen.setText(String.valueOf(calTan));


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
