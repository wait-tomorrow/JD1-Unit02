package by.htp.home05.main;

/*
 * 14. Дан одномерный массив A[N]. Найти: 
 * max(a2, a4, ..., a2k) + min(a1, a3, ..., a2k+1)
 */

public class Task14 {

    public static void main(String[] args) {
	int a[] = new int[15];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int k = 6;
	int min = findMin(a, k);
	int max = findMax(a, k);

	System.out.println("min + max: " + min + " + " + max + " = " + (min + max));
    }

    public static int findMax(int a[], int k) {
	int max = a[2];

	System.out.println("Поиск максимального числа среди чисел: ");
	for (int i = 1; i < k * 2; i = i + 2) {
	    System.out.print(a[i] + " | ");
	    if (a[i] > max) {
		max = a[i];
	    }
	}
	System.out.println();

	return max;
    }

    public static int findMin(int a[], int k) {
	int min = a[1];

	System.out.println("Поиск минимального числа среди чисел: ");
	for (int i = 0; i < 2 * k + 1; i = i + 2) {
	    System.out.print(a[i] + " | ");
	    if (a[i] < min) {
		min = a[i];
	    }
	}
	System.out.println();

	return min;
    }
}
