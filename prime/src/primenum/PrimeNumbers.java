package primenum;

public class PrimeNumbers {
	public static void main(String[] args) {
		Primes primes = new Primes();
		/*
		for(int x: primes.getPreviuos(311))
			System.out.println(x);
		*/
		System.out.println(primes.isPrime(311));
	}
}
