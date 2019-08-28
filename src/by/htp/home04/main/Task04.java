package by.htp.home04.main;

/* 
 * 4. Написать метод(методы) для нахождения 
 * наименьшего общего кратного трех натуральных чисел.
 */

public class Task04 {

    public static void main(String[] args) {
	int a[] = { 100, 45, 10 };

	int lcm = a[0];
	for (int i = 0; i < 3; i++) {
	    lcm = Utils.lcm(lcm, a[i]);
	}

	System.out.println(lcm);
    }
}
