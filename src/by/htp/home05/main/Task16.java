package by.htp.home05.main;

/* 
 * 16. Даны действительные числа a1, a2, ..., an. 
 * Найти max(a1+a2n, a+a2n-1, ..., an+an+1)
 */

public class Task16 {

    public static void main(String[] args) {
	int n = 10;
	double a[] = new double[n];
	Utils.fillArray10(a);
	Utils.printArray(a);

	double temp[] = new double[n / 2];

	int lastIndexTemp = 0;
	for (int i = 0; i < n / 2; i++) {
	    temp[lastIndexTemp] = a[i] + a[n / 2 + i];
	    lastIndexTemp++;
	}

	Utils.printArray(temp);

	double max = 0;
	for (int i = 0; i < temp.length; i++) {
	    if (temp[i] > max) {
		max = temp[i];
	    }
	}

	System.out.printf("%7.3f",max);
    }
}
