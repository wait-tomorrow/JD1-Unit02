package by.htp.home05.main;

/*
 * 8. Дан массив действительных чисел, размерность которого N.  
 * Подсчитать, сколько в нем отрицательных, 
 * положительных и нулевых элементов.
 * */

public class Task08 {

    public static void main(String[] args) {
	int n = 10;
	double a[] = new double[n];

	Utils.fillArrayWithNegative10(a);
	Utils.printArray(a);

	int countZero = 0;
	int countPositive = 0;
	int countNegative = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == 0) {
		countZero++;
	    } else if (a[i] > 0) {
		countPositive++;
	    } else {
		countNegative++;
	    }
	}

	System.out.println("Положитльных чисел: " + countPositive);
	System.out.println("Отрицательных чисел: " + countNegative);
	System.out.println("Нулей: " + countZero);
    }
}
