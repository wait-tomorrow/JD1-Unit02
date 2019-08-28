package by.htp.home05.main;

/*
 * 3. Дана последовательность целых чисел а1, а2, ..., аn. 
 * Выяснить, какое число встречается 
 * раньше - положительное или отрицательное
 * */

public class Task03 {

    public static void main(String[] args) {
	int n = 10;
	int a[] = new int[n];
	
	Utils.fillArrayWithNegative10(a);
	Utils.printArray(a);
	
	if (a[0]>0) {
	    System.out.println("Положительное число встречается раньше");
	} else if(a[0]<0) {
	    System.out.println("Негативное число встречается раньше");
	} else {
	    System.out.println(" \0/ ");
	}
    }
}
