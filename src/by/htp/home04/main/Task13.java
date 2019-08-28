package by.htp.home04.main;

/*
 * 13. Дано натуральное число N. 
 * Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N. 
 * */

public class Task13 {

    public static void main(String[] args) {
	int n = 123456;

	int a[] = createArray(n);
	Utils.printArray(a);
    }

    public static int[] createArray(int n) {
	int razr = Utils.lenghtOfInt(n);
	int a[] = new int[razr];

	while (n > 0) {
	    a[razr - 1] = n % 10;
	    razr--;

	    n = n / 10;
	}

	return a;
    }
}
