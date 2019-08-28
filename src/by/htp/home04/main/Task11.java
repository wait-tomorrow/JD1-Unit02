package by.htp.home04.main;

/*
 * 11. Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; 
 * D[3] + D[4] + D[5]; 
 * D[4] + D[5] + D[6].
 * 
 * Пояснение. 
 * Составить метод(методы) для вычисления суммы 
 * трех последовательно расположенных элементов массива 
 * с номерами от k до m.
 * */

public class Task11 {

    public static void main(String[] args) {
	int d[] = new int[6];

	Utils.fillArray(d);
	Utils.printArray(d);

	System.out.println("D[l] + D[2] + D[3] = " + calculateSum(d, 0, 2));
	System.out.println("D[3] + D[4] + D[5] = " + calculateSum(d, 2, 4));
	System.out.println("D[4] + D[5] + D[6] = " + calculateSum(d, 3, 5));
    }

    public static int calculateSum(int d[], int k, int m) {
	int sum = 0;

	for (int i = k; i <= m; i++) {
	    sum = sum + d[i];
	}

	return sum;
    }
}
