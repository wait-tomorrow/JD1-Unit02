package by.htp.home05.main;

/*
 * 13. Определить количество элементов последовательности натуральных чисел, 
 * кратных числу М и заключенных в промежутке от L до N. 
 * */

public class Task13 {

    public static void main(String[] args) {
	int a[] = new int[20];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int m = 3;
	int l = 5;
	int n = 15;

	int count = 0;
	for (int i = l; i <= n; i++) {
	    if (a[i] % m == 0) {
		count++;
	    }
	}

	System.out.println("Количество чисел, кратных числу " + m + ": " + count);
    }
}
