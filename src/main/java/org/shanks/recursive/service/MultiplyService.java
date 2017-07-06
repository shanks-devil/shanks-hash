package org.shanks.recursive.service;

public class MultiplyService {

	public static void table99() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
			}
			System.out.println();
		}
	}

	public static void new99(int start) {
		for (int i = 1; i <= start; i++) {
			System.out.print(i + "*" + start + "=" + (i * start) + " ");
		}
		System.out.println();
		++start;
		if (start <= 9) {
			new99(start);
		}
		
	}

	public static void new99() {
		new99(1);
	}

	public static void m(int i) {
		if (i == 1) {
			System.out.println("1*1=1 ");
		} else {
			m(i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}
			System.out.println();
		}
	}

	public static void m() {
		m(9);
	}

	public static void mnew99(int end) {
		if (end > 1) {
			mnew99(end - 1);
			for (int i = 1; i <= end; i++) {
				System.out.print(i + "*" + end + "=" + i * end + " ");
			}
			System.out.println();
		} else {
			System.out.println("1*1=1");
		}
	}
	
	public static void mnew99() {
		mnew99(9);
	}
	
	
	public static int factorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * factorial(n -1);
		}
	}
	
	public static void tower(int a, int b, int c, int count) {
		
	}
	public static void hano(char a, char b, char c, int n) {
	    if (n > 0) {
	        hano(a, c, b, n-1);
	        move(a, c);
	        hano(b, a, c, n-1);
	    }
	}

	public static void move(char a, char b)
	{
	}
	public static void main(String[] args) {
		MultiplyService.hano('a', 'b', 'c', 7);
	}
}
