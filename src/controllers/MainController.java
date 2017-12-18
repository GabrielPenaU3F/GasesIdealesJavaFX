package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.CalculadoraGases;

public class MainController {

    private CalculadoraGases calc;
    @FXML private Label tempResultText;
    @FXML private TextField presionIn;
    @FXML private TextField volumenIn;
    @FXML private TextField molesIn;

    public MainController() {

        this.calc = new CalculadoraGases();

    }

    @FXML
    private void handleButtonCalcular(ActionEvent event) {

        Double presionDouble = Double.parseDouble(presionIn.getText());
        Double volumenDouble = Double.parseDouble(volumenIn.getText());
        Integer molesInt = Integer.parseInt(molesIn.getText());
        Double temp = this.calc.calcularTemperatura(presionDouble, volumenDouble, molesInt);

        tempResultText.setText(temp.toString());
    }


}
