package by.htp.home04.main;

/*
 * 7. На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими 
 * из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив.
 * */

public class Task07 {

    public static void main(String[] args) {
	int n = 4;
	int a[][] = new int[n][];

	a = setPoints(a, n);
	Utils.printArray2D(a);

	findMaxDistance(a);
    }

    public static int[][] setPoints(int a[][], int n) {
	for (int i = 0; i < n; i++) {
	    int b[] = new int[2];
	    a[i] = Utils.fillArray(b);
	}

	return a;
    }

    public static void findMaxDistance(int a[][]) {
	double maxDistance = 0;
	int point1 = -1;
	int point2 = -1;

	for (int i = 0; i < a.length; i++) {
	    for (int j = i; j < a.length; j++) {

		if (i == j) {
		    continue;
		}

		double distance = Utils.lenghtOfVector(a[i][0], a[j][0], a[i][1], a[j][1]);

		if (distance > maxDistance) {
		    maxDistance = distance;
		    point1 = i;
		    point2 = j;
		}
	    }
	}

	if (maxDistance != 0 && (point1 != point2)) {
	    System.out.printf("Максимальное расстояние (%f) между точками %d и %d", maxDistance, point1, point2);
	}
    }
}
