package by.htp.home04.main;

public class Utils {

    public static int gcd(int a, int b) {
	if (a <= 0 || b <= 0) {
	    return 0;
	}

	int t;
	while (b != 0) {
	    t = b;
	    b = a % b;
	    a = t;
	}

	return a;
    }

    public static int lcm(int a, int b) {
	return a * b / gcd(a, b);
    }

    public static int[] fillArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    a[i] = (int) (Math.random() * 10);
	}

	return a;
    }

    public static void printArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " | ");
	}
	System.out.println();
    }

    public static void printArray2D(int a[][]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print("[" + i + "] ");
	    for (int j = 0; j < a[i].length; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
	System.out.println();
    }

    public static double lenghtOfVector(int x1, int x2, int y1, int y2) {
	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static int lenghtOfInt(int a) {
	int razr = 0;

	while (a > 0) {
	    razr++;
	    a = a / 10;
	}

	return razr;
    }
}
