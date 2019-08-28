package by.htp.home05.main;

/*
 * 12. Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами. 
 * */

public class Task12 {

    public static void main(String[] args) {
	int n = 10;
	double a[] = new double[n];
	Utils.fillArray10(a);
	Utils.printArray(a);

	double sum = 0;
	for (int i = 0; i < a.length; i++) {
	    boolean simpleNumber = true;

	    for (int j = 2; j < i; j++) {
		if (i != j && i % j == 0) {
		    simpleNumber = false;
		    break;
		}
	    }

	    if (simpleNumber) {
		System.out.println("Простое число: " + i);
		sum = sum + a[i];
	    }
	}

	System.out.println("Сумма чисел с простыми индексами: " + sum);
    }
}
