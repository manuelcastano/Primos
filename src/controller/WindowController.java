package controller;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	private ArrayList<Label> al;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		b1.setOnAction(e -> {
			generateMatrix();
			color(1);
		});
		b2.setOnAction(e -> {
			generateMatrix();
			color(2);
		});
		b3.setOnAction(e -> {
			generateMatrix();
			color(3);
		});
		al = new ArrayList<Label>();
	}
	
	public void generateMatrix() {
		gp.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top);
		number.matrixSize();
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label("" + aux);
				l.setFont(new Font(15));
				l.setMinHeight(40);
				l.setMinWidth(40);
				al.add(l);
				gp.add(l, j, i);
				aux++;
			}
		}
	}
	
	public void color(int method) {
		for (int i = 0; i < al.size(); i++) {
			int theNumber = Integer.parseInt(al.get(i).getText());
			if(method == 1) {
				if(number.isPrimeNumber1(theNumber)) {
					al.get(i).setTextFill(Color.GREEN);
				} else {
					al.get(i).setTextFill(Color.RED);
				}
			} else if(method == 2) {
				if(number.isPrimeNumber2(theNumber)) {
					al.get(i).setTextFill(Color.GREEN);
				} else {
					al.get(i).setTextFill(Color.RED);
				}
			} else {
				if(number.isPrimeNumber3(theNumber)) {
					al.get(i).setTextFill(Color.GREEN);
				} else {
					al.get(i).setTextFill(Color.RED);
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
