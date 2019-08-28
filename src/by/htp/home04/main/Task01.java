package by.htp.home04.main;

/*
 * 1. Треугольник задан координатами своих вершин. 
 * Написать метод для вычисления его площади. 
 */

public class Task01 {

    public static void main(String[] args) {
	int x1 = 1; // A
	int y1 = 1;

	int x2 = 3; // B
	int y2 = 1;

	int x3 = 1; // C
	int y3 = 3;

	System.out.println("Площадь треугольника : " + triangleArea(x1, x2, x3, y1, y2, y3));
    }

    private static double triangleArea(int x1, int x2, int x3, int y1, int y2, int y3) {
	double ab = Utils.lenghtOfVector(x1, x2, y1, y2);
	double ac = Utils.lenghtOfVector(x1, x3, y1, y3);
	double bc = Utils.lenghtOfVector(x2, x3, y2, y3);

	double halfP = (ab + ac + bc) / 2; // полупериметр
	double s = Math.sqrt(halfP * (halfP - ab) * (halfP - bc) * (halfP - ac));

	return s;
    }
}
