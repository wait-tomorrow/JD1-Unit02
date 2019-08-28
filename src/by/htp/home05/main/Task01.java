package by.htp.home05.main;

/*
 * 1. В массив A[N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К
 * */

public class Task01 {

    public static void main(String[] args) {
	int n = 10;
	int k = 3;

	int a[] = new int[n];
	Utils.fillArray100(a);
	Utils.printArray(a);

	int sum = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] % k == 0) {
		sum = sum + a[i];
	    }
	}

	System.out.println(sum);
    }
}
