package by.htp.home05.main;

/*
 * 4. Дана последовательность действительных чисел а1, а2 , ..., аn. 
 * Выяснить, будет ли она возрастающей.
 * */

public class Task04 {

    public static void main(String[] args) {
	int n = 10;
	int a[] = new int[n];
	// int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	Utils.fillArray10(a);
	Utils.printArray(a);

	if (checkIncreasingSequence(a)) {
	    System.out.println("Эта последовательность - возрастающая");
	} else {
	    System.out.println("Эта последовательность - НЕ возрастающая");
	}
    }

    public static boolean checkIncreasingSequence(int a[]) {
	boolean increasing = true;
	int prev = 0;

	for (int i = 0; i < a.length; i++) {
	    if (a[i] >= prev) {
		prev = a[i];
	    } else {
		increasing = false;
		break;
	    }
	}

	return increasing;
    }

}
