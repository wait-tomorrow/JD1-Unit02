package by.htp.home04.main;

/*
 * 5. Написать метод(методы)для нахождения 
 * суммы большего и меньшего из трех чисел.
 * */

public class Task05 {

    public static void main(String[] args) {
	int a = 8;
	int b = 7;
	int c = 3;

	System.out.println("Наименьшее число: " + min(a, b, c));
	System.out.println("Наибольшее число: " + max(a, b, c));
	System.out.println("Сумма этих чисел: " + (min(a, b, c) + max(a, b, c)));
    }

    public static int min(int a, int b, int c) {
	int min = a;

	if (b < min) {
	    min = b;
	}

	if (c < min) {
	    min = c;
	}

	return min;
    }

    public static int max(int a, int b, int c) {
	int max = a;

	if (b > max) {
	    max = b;
	}

	if (c > max) {
	    max = c;
	}

	return max;
    }
}
