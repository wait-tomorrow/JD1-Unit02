package by.htp.home04.main;

/*
 * 3. Написать метод(методы)для нахождения 
 * наибольшего общего делителя четырех натуральных чисел.
 * */

public class Task03 {

    public static void main(String[] args) {
	int a[] = { 100, 45, 500, 300 };

	int gcd = a[0];
	for (int i = 0; i < 4; i++) {
	    gcd = Utils.gcd(gcd, a[i]);
	}

	System.out.println(gcd);
    }
}
