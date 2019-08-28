package by.htp.home06.main;

/*
 * 2. Даны две последовательности a1 <= a2 <= ... <=an и b1 <= b2 <= ... <=bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать. 
 * */

public class Task02 {

    public static void main(String[] args) {
	int a[] = { 0, 1, 2, 5, 10 };
	int b[] = { 1, 3, 4, 5, 9 };

	Utils.printArray(a);
	Utils.printArray(b);

	int c[] = new int[a.length + b.length];
	int lastIndexA = 0;
	int lastIndexB = 0;
	for (int i = 0; i < c.length; i++) {

	    if (lastIndexA == a.length) {
		c[i] = b[lastIndexB];
		lastIndexB++;

	    } else if (lastIndexB == b.length) {
		c[i] = a[lastIndexA];
		lastIndexA++;

	    } else {
		if (a[lastIndexA] < b[lastIndexB]) {
		    c[i] = a[lastIndexA];
		    lastIndexA++;
		} else {
		    c[i] = b[lastIndexB];
		    lastIndexB++;
		}
	    }
	}

	Utils.printArray(c);
    }
}
