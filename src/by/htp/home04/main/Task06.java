package by.htp.home04.main;

/*
 * 6. Вычислить площадь правильного шестиугольника 
 * со стороной а, используя метод вычисления площади треугольника.
 * */

public class Task06 {

    public static void main(String[] args) {
	double a = 5;
	
	System.out.println(area(a));
    }

    public static double area(double a) {
	return (a*a)*(3*Math.sqrt(3)/2);
    }
}
