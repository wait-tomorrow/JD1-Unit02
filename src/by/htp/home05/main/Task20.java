package by.htp.home05.main;

/*
 * 20. Дан целочисленный массив с количеством элементов n. 
 * Сжать массив, выбросив из него каждый второй элемент 
 * (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать. 
 * */

public class Task20 {

    public static void main(String[] args) {
	// int n = 10;
	// int a[] = new int[n];
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	// Utils.fillArray10(a);
	Utils.printArray(a);

	// нумерация элементов массива начинается с 0
	// значит, "каждый второй" - это 1, 3, 5, 7 и т.д.
	// то есть, нечётные
	for (int i = 0; i < a.length; i++) {
	    if (i % 2 != 0) {
		a[i] = -9999;
	    }
	}

	a = trimArray(a);

	Utils.printArray(a);
    }

    public static int[] trimArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == -9999) {
		for (int j = 0; j < a.length - i - 1; j++) {
		    a[i + j] = a[i + j + 1];
		}

		a[a.length - 1] = 0;
	    }
	}

	return a;
    }
}
