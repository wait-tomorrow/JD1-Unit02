package by.htp.home04.main;

/*
 * 2. Написать метод(методы)для нахождения 
 * наибольшего общего делителя (НОД, GCD) и 
 * наименьшего общего кратного (НОК, LCM)
 * двух натуральных чисел
 * */

public class Task02 {

    public static void main(String[] args) {
	int a = 100;
	int b = 45;

	System.out.println(Utils.gcd(a, b));
	System.out.println(Utils.lcm(a, b));
    }
}
