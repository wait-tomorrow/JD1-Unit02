package by.htp.home04.main;

/*
 * 15. Даны натуральные числа К и N. 
 * Написать метод(методы) формирования массива А, элементами которого 
 * являются числа, сумма цифр которых равна К и которые не больше N. 
 * */

public class Task15 {

    public static void main(String[] args) {
	int k = 10;
	int n = 100;
	int a[];

	int countNums = 0;
	for (int i = 0; i <= n; i++) {
	    if (checkSumDigit(i, k)) {
		countNums++;
	    }
	}

	a = new int[countNums];
	int lastIndexA = 0;

	for (int i = 0; i < n; i++) {
	    if (checkSumDigit(i, k)) {
		a[lastIndexA] = i;
		lastIndexA++;
	    }
	}

	Utils.printArray(a);
    }

    public static boolean checkSumDigit(int num, int k) {
	int sum = 0;

	while (num > 0) {
	    sum = sum + (num % 10);
	    num = num / 10;
	}

	if (sum == k) {
	    return true;
	}

	return false;
    }
}
