package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Label Lab1;
    @FXML private Label Lab2;
    @FXML private Label Lb;
    @FXML private TextField TxtF2;
    @FXML private TextField TxtF1;


    @FXML protected void Imprimir (ActionEvent Button ){
        String nombre = TxtF1.getText();
        String edad = TxtF2.getText();
        int TxtF2 = Integer.parseInt(edad);
        if (TxtF2 >= 18)
            Lb.setText("Puedes votar, " + nombre);
        else if (TxtF2 < 18) {
            Lb.setText("No puedes votar, " + nombre);
        }


    }


}
