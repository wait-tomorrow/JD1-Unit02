package by.htp.home05.main;

/*
 * 2. В целочисленной последовательности есть нулевые элементы. 
 * Создать массив из номеров этих элементов.
 * */

public class Task02 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	setZeroElements(a);
	Utils.printArray(a);

	int countZeroElement = calculateCountZeroElements(a);
	int zeroElements[] = findZeroElements(a, countZeroElement);
	Utils.printArray(zeroElements);
    }

    public static void setZeroElements(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    if (Math.random() > 0.5) {
		a[i] = 0;
	    }
	}
    }

    public static int calculateCountZeroElements(int a[]) {
	int count = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] == 0) {
		count++;
	    }
	}

	return count;
    }

    public static int[] findZeroElements(int a[], int count) {
	int indexOfZeroElements[] = new int[count];
	int lastIndex = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] == 0) {
		indexOfZeroElements[lastIndex] = i;
		lastIndex++;
	    }
	}

	return indexOfZeroElements;
    }
}
