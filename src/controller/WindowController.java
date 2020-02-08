package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.Numbers;

public class WindowController implements Initializable{
	
	private Numbers number;
	@FXML
	private TextField tfTop;
	@FXML
	private GridPane gp;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		b1.setOnAction(e -> {
			generateMatrix(1);
		});
		b2.setOnAction(e -> {
			generateMatrix(2);
		});
		b3.setOnAction(e -> {
			generateMatrix(3);
		});
	}
	
	public void generateMatrix(int method) {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length; j++) {
				Label l = new Label("");
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				gp.add(l, j, i);
			}
		}
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label(aux + "");
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				if(method == 1) {
					if(number.isPrimeNumber1(aux)) {
						l.setTextFill(Color.GREEN);
					} else {
						l.setTextFill(Color.RED);
					}
				} else if(method == 2) {
					if(number.isPrimeNumber2(aux)) {
						l.setTextFill(Color.GREEN);
					} else {
						l.setTextFill(Color.RED);
					}
				} else {
					if(number.isPrimeNumber3(aux)) {
						l.setTextFill(Color.GREEN);
					} else {
						l.setTextFill(Color.RED);
					}
				}
				gp.add(l, j, i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				aux++;
			}
		}
	}
}
