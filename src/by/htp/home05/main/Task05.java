package by.htp.home05.main;

/*
 * 5. Дана последовательность натуральных чисел а1, а2,..., аn. 
 * Создать массив из четных чисел этой последовательности. 
 * Если таких чисел нет, то вывести сообщение об этом факте.
 * */

public class Task05 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int countEven = calculateCountEvenNumbers(a);

	if (countEven == 0) {
	    System.out.println("В последовательности нет чётных чисел");
	    return;
	}

	int evenNumbers[] = findEvenNumbers(a, countEven);
	Utils.printArray(evenNumbers);
    }

    public static int calculateCountEvenNumbers(int a[]) {
	int count = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] % 2 == 0) {
		count++;
	    }
	}

	return count;
    }

    public static int[] findEvenNumbers(int a[], int count) {
	int evenNumbers[] = new int[count];
	int lastIndex = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] % 2 == 0) {
		evenNumbers[lastIndex] = a[i];
		lastIndex++;
	    }
	}

	return evenNumbers;
    }
}
