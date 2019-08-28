package by.htp.home06.main;

public class Utils {

    public static int[] fillArray100(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = (int) (Math.random() * 100);
	}

	return a;
    }

    public static int[] fillArray10(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = (int) (Math.random() * 10);
	}

	return a;
    }

    public static int[] fillArray10Numbers10(int a[], int n) {
	for (int i = 0; i < n; i++) {
	    a[i] = (int) (Math.random() * 10);
	}

	return a;
    }

    public static double[] fillArray10(double a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = Math.random() * 10;
	}

	return a;
    }

    public static int[] fillArrayWithNegative10(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = (int) (Math.random() * 10);
	    if (Math.random() > 0.5) {
		a[i] = -1 * a[i];
	    }
	}

	return a;
    }

    public static double[] fillArrayWithNegative10(double a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = Math.random() * 10;
	    if (Math.random() > 0.5) {
		a[i] = -1 * a[i];
	    }
	}

	return a;
    }

    public static void printArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " | ");
	}
	System.out.println();
    }

    public static void printArray(double a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " | ");
	}
	System.out.println();
    }
    
    public static int[] shiftElements(int a[], int startPos, int count) {
	for (int j = 0; j < count; j++) {
	    for (int i = a.length - 1; i > startPos; i--) {
		a[i] = a[i - 1];
	    }
	}

	return a;
    }
}
