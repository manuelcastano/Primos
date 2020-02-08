package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	public void generateMatrix1() {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label(aux + "");
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				if(number.isPrimeNumber1(aux)) {
					l.setTextFill(Color.GREEN);
				} else {
					l.setTextFill(Color.RED);
				}
				GridPane.setVgrow(l, Priority.ALWAYS);
				GridPane.setHgrow(l, Priority.ALWAYS);
				gp.add(l, j, i);
				aux++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void generateMatrix2() {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label(aux + "");
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				if(number.isPrimeNumber2(aux)) {
					l.setTextFill(Color.GREEN);
				} else {
					l.setTextFill(Color.RED);
				}
				GridPane.setVgrow(l, Priority.ALWAYS);
				GridPane.setHgrow(l, Priority.ALWAYS);
				gp.add(l, j, i);
				aux++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void generateMatrix3() {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label(aux + "");
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				if(number.isPrimeNumber3(aux)) {
					l.setTextFill(Color.GREEN);
				} else {
					l.setTextFill(Color.RED);
				}
				GridPane.setVgrow(l, Priority.ALWAYS);
				GridPane.setHgrow(l, Priority.ALWAYS);
				gp.add(l, j, i);
				aux++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
