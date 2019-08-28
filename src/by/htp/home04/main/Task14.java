package by.htp.home04.main;

/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 
 * */

public class Task14 {

    public static void main(String[] args) {
	int a = 12345;
	int b = 123456;

	int razrA = Utils.lenghtOfInt(a);
	int razrB = Utils.lenghtOfInt(b);

	if (razrA > razrB) {
	    System.out.println("Число А содержит больше цифр");
	} else if (razrB > razrA) {
	    System.out.println("Число В содержит больше цифр");
	} else {
	    System.out.println("Числа А и В равны");
	}
    }
}
