package by.htp.home05.main;

/*
 * 15. Дана последовательность действительных чисел a1, a2, ..., an. 
 * Указать те ее элементы, которые принадлежат отрезку [с, d].
 * */

public class Task15 {

    public static void main(String[] args) {
	double a[] = new double[15];
	Utils.fillArray10(a);
	Utils.printArray(a);

	double c = 5;
	double d = 12;

	System.out.println("Заданный отрезок: [" + c + ", " + d + "]");

	for (int i = 0; i < a.length; i++) {
	    if (a[i] >= c && a[i] <= d) {
		System.out.println("Индекс: " + i + ", значение элемента: " + a[i]);
	    }
	}
    }
}
