package threads;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class ColorThread implements Runnable {
	
	private Label l;
	private int seconds;
	private Color color;

	public ColorThread(Label l, int seconds, Color color) {
		this.l = l;
		this.seconds = seconds;
		this.color = color;
	}

	public Label getL() {
		return l;
	}

	public void setL(Label l) {
		this.l = l;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(seconds*500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		l.setTextFill(color);
	}
}
