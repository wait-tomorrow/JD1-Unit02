package by.htp.home05.main;

/*
 * 17. Дана последовательность целых чисел a1, a2, ..., an. 
 * Образовать новую последовательность, выбросив из исходной те члены, 
 * которые равны min(a1, a2, ..., an). 
 * */

public class Task17 {

    public static void main(String[] args) {
	int a[] = new int[15];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int min = findMin(a);
	int count = countMin(a, min);
	int b[] = deleteMinElements(a, min, count);

	System.out.println("min: " + min);
	System.out.println("Количество минимальных элементов: " + count);
	Utils.printArray(b);
    }

    public static int findMin(int a[]) {
	int min = a[0];

	for (int i = 1; i < a.length; i++) {
	    if (a[i] < min) {
		min = a[i];
	    }
	}

	return min;
    }

    public static int countMin(int a[], int min) {
	int count = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] == min) {
		count++;
	    }
	}

	return count;
    }

    public static int[] deleteMinElements(int a[], int min, int count) {
	int b[] = new int[a.length - count];
	int lastIndex = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] != min) {
		b[lastIndex] = a[i];
		lastIndex++;
	    }
	}

	return b;
    }
}
