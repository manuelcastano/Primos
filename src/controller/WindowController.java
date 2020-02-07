package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.border.StrokeBorder;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.Numbers;

public class WindowController implements Initializable{
	
	private Numbers number;
	@FXML
	private TextField tfTop;
	@FXML
	private GridPane gp;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	public void generateMatrix() {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label(aux + "");
				l.setFont(new Font(15));
				if(number.isPrimeNumber1(aux)) {
					l.setTextFill(Color.GREEN);
				} else {
					l.setTextFill(Color.RED);
				}
				gp.add(l, j, i);
				aux++;
			}
		}
	}
}
