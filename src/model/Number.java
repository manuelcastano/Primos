package model;

public class Number {
	
	private int top;
	private int [][] matrix;
	
	public Number(int top, int[][] matrix) {
		this.top = top;
		this.matrix = matrix;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void matrixSize() {
		double root = Math.sqrt(top);
		if(root % 1 == 0) {
			matrix = new int[(int) root][(int) root];
		} else {
			matrix = new int[(int) root+1][(int) root+1];
		}
	}
}
