package by.htp.home06.main;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов 
 * и натуральное число k. Объединить их в один массив, 
 * включив второй массив между k-м и (k+1) - м элементами первого, 
 * при этом не используя дополнительный массив.
 * */

public class Task01 {

    public static void main(String[] args) {
	int a[] = new int[15];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int b[] = new int[5];
	Utils.fillArray10(b);
	Utils.printArray(b);

	int k = 5;
	mergeArrays(a, b, k);
	Utils.printArray(a);
    }

    public static void mergeArrays(int a[], int b[], int k) {
	int countNewElements = b.length;
	a = Utils.shiftElements(a, k, countNewElements);

	for (int i = 0; i < countNewElements; i++) {
	    a[i + k] = b[i];
	}
    }

}
