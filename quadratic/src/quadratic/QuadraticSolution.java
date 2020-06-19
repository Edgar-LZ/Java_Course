package quadratic;

public class QuadraticSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticSolving quad = new QuadraticSolving();
		for(int i=0; i<2; i++){
			System.out.println(quad.solve(1,0,1)[i]);
		}
	}

}
