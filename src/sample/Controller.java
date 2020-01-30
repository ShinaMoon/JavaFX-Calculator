package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Button btn;

    @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField result;

    @FXML
    void calculate(MouseEvent event) {
        String a = inputA.getText();
        String b = inputB.getText();

        if (a.equals("") || b.equals("")) {
            System.out.println("Ns t,kfy");
            return;
        }

        result.setText(String.valueOf(Calculate.sum(Integer.parseInt(a), Integer.parseInt(b))));
    }

    @FXML
    void initialize() {

    }
}