package controller;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.Numbers;

public class WindowController implements Initializable{
	
	private Numbers number;
	@FXML
	private TextField tfTop;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private AnchorPane ap;

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
		ap.getChildren().clear();
		int top = Integer.parseInt(tfTop.getText());
		number = new Numbers(top, method);
		int aux = 1;
		for (int i = 0; i < number.getMatrix().length; i++) {
			for (int j = 0; j < number.getMatrix()[0].length && aux <= top; j++) {
				Label l = new Label("" + aux);
				l.setLayoutX(i*30);
				l.setLayoutY(j*30);
				l.setFont(new Font(15));
				if(number.getBooleans()[i][j]) {
					l.setTextFill(Color.GREEN);
				} else {
					l.setTextFill(Color.RED);
				}
				ap.getChildren().add(l);
				
				try {
					Thread.currentThread().sleep(1000);
					System.out.println(Thread.currentThread().getName());
					System.out.println(ap.getChildren().toString());
				} catch (Exception e) {
					
				}
				aux++;
			}
		}
	}
}
