package by.htp.home04.main;

/*
 * 17. Натуральное число, в записи которого n цифр, называется числом 
 * Армстронга, если сумма его цифр, возведенная в степень n, равна 
 * самому числу. Найти все числа Армстронга от 1 до k. 
 * Для решения задачи использовать декомпозицию. 
 * */

public class Task17 {

    public static void main(String[] args) {
	int k = 10000;

	for (int i = 1; i <= k; i++) {
	    if (isNarcissisticNumber(i)) {
		System.out.print(i + " ");
	    }
	}
    }

    public static boolean isNarcissisticNumber(int num) {
	int razr = calculateRazrNumber(num);
	int sum = 0;

	int num1 = num;
	while (num1 > 0) {
	    sum = sum + ((int) Math.pow((num1 % 10), razr));
	    num1 = num1 / 10;
	}

	if (sum == num) {
	    return true;
	}

	return false;
    }

    public static int calculateRazrNumber(int num) {
	int razr = 0;

	while (num > 0) {
	    razr++;
	    num = num / 10;
	}

	return razr;
    }
}
