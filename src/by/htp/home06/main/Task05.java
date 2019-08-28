package by.htp.home06.main;

/*
 * 5. Сортировка вставками.
 * Дана последовательность a1, a2, ..., an 
 * Требуется переставить числа в порядке возрастания.  
 * Делается  это  следующим  образом.  Пусть a1, a2, ..., an - упорядоченная  последовательность,  
 * т. е. a1 <= a2 <= ... <= an.  Берется  следующее  число ai+1 и  вставляется  в  последовательность  так,  
 * чтобы  новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с 
 * помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 * */

public class Task05 {

    public static void main(String[] args) {
	int a[] = new int[10];
	Utils.fillArray10(a);
	Utils.printArray(a);

	for (int i = 1; i < a.length; i++) {

	    int x = a[i];
	    int min = binarySearch(a, a[i], 0, i);

	    for (int j = i; j > min; j--) {
		a[j] = a[j - 1];
	    }
	    a[min] = x;
	}

	Utils.printArray(a);
    }

    public static int binarySearch(int a[], int number, int min, int max) {
	while (min < max) {
	    int half = min + (max - min) / 2;

	    if (number < a[half]) {
		max = half;
	    } else {
		min = half + 1;
	    }
	}
	return min;
    }
}
