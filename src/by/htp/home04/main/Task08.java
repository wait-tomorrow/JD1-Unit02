package by.htp.home04.main;

/*
 * 8. Составить программу, которая в массиве A[N] 
 * находит второе по величине число (вывести на печать 
 * число, которое меньше максимального элемента массива, 
 * но больше всех других элементов).
 * */

public class Task08 {

    public static void main(String[] args) {
	int a[] = { 1, 8, 5, 6, 9, 3, 3, 4 };

	System.out.println(findPreMaxNumber(a));
    }

    public static int findPreMaxNumber(int a[]) {
	int max = 0;
	int preMax = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] > max) {
		preMax = max;
		max = a[i];
	    } else if (a[i] > preMax && a[i] < max) {
		preMax = a[i];
	    }
	}

	return preMax;
    }
}
