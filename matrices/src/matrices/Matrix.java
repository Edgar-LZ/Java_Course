package matrices;

public class Matrix {
	int rows;
	int cols;
	int[][] arr;
	public Matrix(int[][] mat) {
		IllegalArgumentException except = new IllegalArgumentException("Invalid Matrix");
		rows = mat.length;
		cols = mat[0].length;
		arr = mat;
		
		for(int i=0;i<rows;i++) {
			if(mat[i].length != cols) {
				throw except;
			}
		}
	}
	int getRows() {
		return rows;
	}
	int getCols() {
		return cols;
	}
	int[][] toArray(){
		return arr;
	}
	int getElement(int a,int b) {
		return arr[a][b];
	}
	public Matrix rightMult(Matrix other) {
		IllegalArgumentException except = new IllegalArgumentException("Not a valid matrix product");
		if(other.getRows() != this.getCols()) {
			throw except;
		}
		int[][] product = new int[this.getRows()][other.getCols()];
		for(int i =0;i<this.getRows();i++)
			for(int j =0;j<other.getCols();j++)
				for(int k =0;k<this.getCols();k++)
					product[i][j]+=this.getElement(i,k)*other.getElement(k,j);
						
						
		return new Matrix(product);
	}
	
	public Matrix leftMult(Matrix other) {
		IllegalArgumentException except = new IllegalArgumentException("Not a valid matrix product");
		if(this.getRows() != other.getCols()) {
			throw except;
		}
		int[][] product = new int[other.getRows()][this.getCols()];
		for(int i =0;i<other.getRows();i++)
			for(int j =0;j<this.getCols();j++)
				for(int k =0;k<other.getCols();k++)
					product[i][j]+=other.getElement(i,k)*this.getElement(k, j);
						
						
		return new Matrix(product);
	}

}
