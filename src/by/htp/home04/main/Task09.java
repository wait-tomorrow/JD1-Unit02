package by.htp.home04.main;

/*
 * 9. Написать метод(методы), проверяющий, 
 * являются ли данные три числа взаимно простыми.*/

public class Task09 {

    public static void main(String[] args) {
	int a = 3;
	int b = 2;
	int c = 5;

	isSipleNumbers(a, b, c);
    }

    public static void isSipleNumbers(int a, int b, int c) {
	int gcd = Utils.gcd(Utils.gcd(a, b), c);

	if (gcd == 1) {
	    System.out.println("Это взаимно простые числа");
	} else {
	    System.out.println("Это НЕ взаимно простые числа");
	}
    }
}
