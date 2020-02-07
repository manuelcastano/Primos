package model;

public class Numbers {
	
	private int top;
	private int [][] matrix;
	
	public Numbers(int top) {
		this.top = top;
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
	
	public boolean isPrimeNumber1(int number) {
		if(number == 1) {
			return false;
		}
		boolean prime = true;
		for (int i = 2; prime && i < number; i++) {
			if(number % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
	
	public boolean isPrimeNumber2(int number)
	{
	    boolean prime = true;
	    if(number < 2)
	    {
	    	prime = false;
	    }
	    else
	    {
	        for(int x = 2; x*x <= number; x++)
	        {
	            if(number % x == 0){
	            	prime = false;
	            	break;
	            }
	        }
	    }
	    return prime;
	}
	
	public boolean isPrimeNumber3(int n){
		int a = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { 
				a++;
			}
		}
		if (a != 2) 
			return false;
		else 
			return true;
	}
}
