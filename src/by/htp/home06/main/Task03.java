package by.htp.home06.main;

/*
 * 3.Сортировка выбором.
 * Дана последовательность чисел a1 <= a2 <= ... <= an
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент 
 * и ставится на первое место, а первый - на место наибольшего. 
 * Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором
 * */

public class Task03 {

    public static void main(String[] args) {
	int a[] = { 1, 3, 4, 5, 7, 8, 10, 12, 15 };
	Utils.printArray(a);

	for (int i = 0; i < a.length; i++) {
	    int max = 0;
	    int maxIndex = 0;

	    for (int j = i; j < a.length; j++) {
		if (a[j] > max) {
		    max = a[j];
		    maxIndex = j;
		}
	    }

	    int temp = a[maxIndex];
	    a[maxIndex] = a[i];
	    a[i] = temp;
	}

	Utils.printArray(a);
    }
}
