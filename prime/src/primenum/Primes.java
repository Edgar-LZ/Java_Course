package primenum;
import java.util.ArrayList;


public class Primes {
	public boolean isPrime(int num) {
		ArrayList<Integer> previous = getPreviuos(num);
		for(int i: previous)
			if(num%i ==0)
				return false;
		return true;
	}
	public ArrayList<Integer> getPreviuos(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(num <= 2)
			return list;
		list.add(2);
		if(num <= 3)
			return list;
		list.add(3);
		for(int i=5;i<num;i+=2) {
			int j = 0;
			while(j <list.size() && i%list.get(j)!=0)
				j++;
			if(j==list.size())
				list.add(i);
		}
		
		return list;
	}

}
