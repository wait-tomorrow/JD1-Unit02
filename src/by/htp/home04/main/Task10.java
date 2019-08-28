package by.htp.home04.main;

/*
 * 10. Написать метод(методы) для вычисления 
 * суммы факториалов всех нечетных чисел от 1 до 9
 * */

public class Task10 {

    public static void main(String[] args) {
	long sum = 0;

	for (int i = 1; i <= 9; i = i + 2) {
	    sum = sum + calculateFactorial(i);
	}

	System.out.println(sum);
    }

    public static long calculateFactorial(int n) {
	long factorial = 1;
	;
	for (int i = 1; i <= n; i++) {
	    factorial = factorial * i;
	}

	return factorial;
    }
}
