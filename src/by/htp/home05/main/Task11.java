package by.htp.home05.main;

/*
 * 11. Даны натуральные числа а1, а2, ..., аn. 
 * Указать те из них, у которых остаток от деления 
 * на М равен L(0 < L< М-1).
 * */

public class Task11 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int m = 3;
	int l = 1;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] % m == l) {
		System.out.print(a[i] + " | ");
	    }
	}
    }
}
