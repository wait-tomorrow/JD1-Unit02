package by.htp.home05.main;

/*
 * 10. Даны целые числа а1,а2 ,..., аn. 
 * Вывести на печать только те числа, для которых аi > i.
 * */

public class Task10 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	for (int i = 0; i < a.length; i++) {
	    if (a[i] > i) {
		System.out.print(a[i] + " | ");
	    }
	}
    }
}
