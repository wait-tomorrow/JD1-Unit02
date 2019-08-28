package by.htp.home05.main;

/*
 * 9. Даны действительные числа а1, а2, ..., аn. 
 * Поменять местами наибольший и наименьший элементы.
 * */

public class Task09 {

    public static void main(String[] args) {
	double a[] = new double[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int min = findMinElementIndex(a);
	int max = findMaxElementIndex(a);

	double temp = a[min];
	a[min] = a[max];
	a[max] = temp;

	Utils.printArray(a);
    }

    public static int findMinElementIndex(double a[]) {
	int min = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] < a[min]) {
		min = i;
	    }
	}

	return min;
    }

    public static int findMaxElementIndex(double a[]) {
	int max = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] > a[max]) {
		max = i;
	    }
	}

	return max;
    }

}
