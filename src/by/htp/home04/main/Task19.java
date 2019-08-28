package by.htp.home04.main;

/*
 * 19. Написать программу, определяющую сумму n - значных чисел, 
 * содержащих только нечетные цифры. Определить также, сколько 
 * четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию. 
 * */

public class Task19 {

    public static void main(String[] args) {
	int n = 3;

	int sum = 0;
	for (int i = 10; i < Math.pow(10, n); i++) {
	    if (checkDigitUneven(i)) {
		sum = sum + i;
	    }
	}

	System.out.println("Сумма: " + sum);
	System.out.println("Количество чётных цифр: " + calculateEvenNums(sum));
    }

    public static boolean checkDigitUneven(int num) {
	while (num > 0) {
	    if (num % 2 == 0) {
		return false;
	    }
	    num = num / 10;
	}

	return true;
    }

    public static int calculateEvenNums(int num) {
	int countEven = 0;

	while (num > 0) {
	    if (num % 2 == 0) {
		countEven++;
	    }
	    num = num / 10;
	}

	return countEven;
    }
}
