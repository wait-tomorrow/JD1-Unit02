package by.htp.home04.main;

/*
 * 16. Два простых числа называются «близнецами», если они отличаются 
 * друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары 
 * «близнецов» из отрезка [n,2n], где n - заданное натуральное 
 * число больше 2. Для решения задачи использовать декомпозицию. 
 * */

public class Task16 {

    public static void main(String[] args) {
	int n = 100;

	findNumbers(n);
    }

    public static void findNumbers(int n) {
	System.out.printf("Пары «близнецов» на отрезке [%d,%d]\n", n, (2 * n));

	for (int i = n; i <= n * 2 - 2; i++) {
	    if (isSipleNumber(i) && isSipleNumber(i + 2)) {
		System.out.printf("%d и %d\n", i, i + 2);
	    }
	}
    }

    public static boolean isSipleNumber(int num) {
	boolean simpleNumber = true;

	for (int i = 2; i < num; i++) {
	    if (num % i == 0) {
		simpleNumber = false;
		break;
	    }
	}

	return simpleNumber;
    }
}
