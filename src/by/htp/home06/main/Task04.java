package by.htp.home06.main;

/*
 * 4.Сортировка обменами.
 * Дана последовательность чисел a1 <= a2 <= ... <= an
 * Требуется переставить числа в порядке возрастания. 
 * Для этого сравниваются два соседних числа ai и a+1. 
 * Если ai > ai+1, то делается перестановка. 
 * Так продолжается до тех пор, пока все элементы не станут расположены 
 * в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * */

public class Task04 {

    public static void main(String[] args) {
	int a[] = { 1, 3, 4, 5, 7, 8, 10, 12, 15 };
	Utils.printArray(a);

	boolean oneMore = true;

	while (oneMore) {
	    oneMore = false;

	    for (int i = 0; i < a.length - 1; i++) {
		if (a[i] < a[i + 1]) {
		    int temp = a[i];
		    a[i] = a[i + 1];
		    a[i + 1] = temp;

		    oneMore = true;
		}
	    }
	}

	Utils.printArray(a);
    }
}
