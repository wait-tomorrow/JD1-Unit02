package by.htp.home04.main;

/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y—прямой.
 */

public class Task12 {

    public static void main(String[] args) {
	int x = 5;
	int y = 6;
	int z = 7;
	int t = 8;

	double area = area(x, y, z, t);
	System.out.printf("Площадь четырёхугольника равна %f", area);
    }

    public static double area(int x, int y, int z, int t) {
	double d = Math.sqrt(x * x + y * y);
	double s1 = x * y * 0.5;
	double s2 = 0.25 * Math.sqrt((d + z + t) * (d + z - t) * (d + t - z) * (z + t - d));
	double s = s1 + s2;

	return s;
    }
}
