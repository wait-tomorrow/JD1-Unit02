package by.htp.home05.main;

/*
 * 7. Дана последовательность действительных чисел а1, а2, ..., аn. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен.
 * */

public class Task07 {

    public static void main(String[] args) {
	int a[] = new int[10];
	int z = 5;
	Utils.fillArray10(a);
	Utils.printArray(a);

	int replaceCount = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] > z) {
		a[i] = z;
		replaceCount++;
	    }
	}

	Utils.printArray(a);
	System.out.println("Количество замен: " + replaceCount);
    }
}
