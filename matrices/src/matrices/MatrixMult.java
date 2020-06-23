package matrices;

public class MatrixMult {

	public static void main(String[] args) {
		int[][] arr1 = {
				{2,3,1},
				{1,2,3}
		};
		int[][] arr2 = {
				{3,3},
				{2,2},
				{1,1}
		};
		
		Matrix mat1 = new Matrix(arr1);
		Matrix mat2 = new Matrix(arr2);
		Matrix rightproduct = mat1.rightMult(mat2);
		Matrix leftproduct = mat1.leftMult(mat2);
		
		for(int i=0;i<rightproduct.getRows();i++) {
			for(int j=0;j<rightproduct.getCols();j++) {
				System.out.print(Integer.toString(rightproduct.getElement(i, j))+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n==============\n");
		
		for(int i=0;i<leftproduct.getRows();i++) {
			for(int j=0;j<leftproduct.getCols();j++) {
				System.out.print(Integer.toString(leftproduct.getElement(i, j))+" ");
			}
			System.out.print("\n");
		}
		
	}

}
