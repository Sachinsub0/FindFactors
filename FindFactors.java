package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class FindFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 100;
		LinkedList<Integer> factors = findPrimeFactors(test);
		System.out.println(factors);
		LinkedList<Integer> primeFactors = new LinkedList<Integer>();
		
		for (int item: factors) {
			if (isPrime(item)) {
				primeFactors.add(item);
			}
		}
		System.out.println(primeFactors);
		int[] sortMe = new int[primeFactors.size()];
		for (int i = 0; i < primeFactors.size(); i++) {
			sortMe[i] = primeFactors.get(i);
		}
		Arrays.sort(sortMe);
		for (int i = 0; i < sortMe.length; i++) {
			System.out.println(sortMe[i]);
		}
	}
	public static LinkedList<Integer> findPrimeFactors(int n) {
		LinkedList<Integer> factors = new LinkedList<Integer>();
		while (n > 1) {
			System.out.println("The value of n is: " + n);
			if (n % 2 == 0) {
				//factors.add(n/2);
				factors.add(2);
				n = n /2;
			} else {
				for (int i = 3; i < n; i++) {
					if (n % i == 0) {
						factors.add(i);
						//factors.add(n);
						n = n / i;
;					}
					
				}
				factors.add(n);
				n = n/n;
			
			}
			
			
		}
		return factors;
	}
	public static boolean isPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0 || n == 1) {
				return false;
			}
		}
		return true;
	}
	/*public static LinkedList<Integer> findFactors(int n) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		return list;
	}*/
}
