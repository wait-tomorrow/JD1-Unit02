package by.htp.home05.main;

/*
 * 6. Дана последовательность чисел а1,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую все эти числа.
 * */

public class Task06 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int max = findMaxElement(a);
	int min = findMinElement(a);

	System.out.println("Наименьшая длинна числовой оси равна " + (max - min));
    }

    public static int findMaxElement(int a[]) {
	int max = a[0];

	for (int i = 0; i < a.length; i++) {
	    if (a[i] > max) {
		max = a[i];
	    }
	}

	return max;
    }

    public static int findMinElement(int a[]) {
	int min = a[0];

	for (int i = 0; i < a.length; i++) {
	    if (a[i] < min) {
		min = a[i];
	    }
	}

	return min;
    }

}
