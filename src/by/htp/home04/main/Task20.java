package by.htp.home04.main;

/*
 * 20. Из заданного числа вычли сумму его цифр. 
 * Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? 
 * Для решения задачи использовать декомпозицию. 
 * */

public class Task20 {

    public static void main(String[] args) {
	int num = 55;

	int steps = 0;
	while (num > 0) {
	    num = num - summOfNumbers(num);

	    steps++;
	}

	System.out.printf("Понадобилось %d шагов", steps);
    }

    public static int summOfNumbers(int num) {
	int sum = 0;

	while (num > 0) {
	    sum = sum + num % 10;
	    num = num / 10;
	}

	return sum;
    }
}
