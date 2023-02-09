package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.println("Number?");
		int n = in.nextInt();
		boolean[ ] numPrime = new boolean[n];


		for(int i = 0; i < n; i++) {

				numPrime[i] = true;




		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {

			if (numPrime[i]== true) {
				
				

				for(int j = i*i; j < n; j+=i) {
					

					numPrime[j] = false;
				}

			}



		}

		for(int i = 0; i < n; i++) {

			if (numPrime[i] == true){

				System.out.println(i);

			}

		}





	}

}
