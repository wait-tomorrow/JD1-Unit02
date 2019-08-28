package by.htp.home05.main;

/*
 * 19. В массиве целых чисел с количеством элементов n найти 
 * наиболее часто встречающееся число. Если таких чисел несколько, 
 * то определить наименьшее из них. 
 * 
 * Решение: создаем матрицу, в которую записываем инфу о том,
 * сколько раз какой элемент встречается в указанном массиве.
 *  
 * */

public class Task19 {

    public static void main(String[] args) {
	int a[] = new int[15];
	Utils.fillArray10(a);
	Utils.printArray(a);

	int nums[][] = new int[10][2];
	initMatrix(nums);

	for (int i = 0; i < a.length; i++) {
	    nums[a[i]][1]++;
	}

	printMatrix(nums);
	findMostCommonElem(nums);
    }

    public static void initMatrix(int matrix[][]) {
	for (int i = 0; i < matrix.length; i++) {
	    matrix[i][0] = i;
	}
    }

    public static void printMatrix(int matrix[][]) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.printf("%4d", matrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public static void findMostCommonElem(int matrix[][]) {
	int maxRate = -1;
	int maxElem = -1;

	// выбираем максимальное количество "встречаний" в массиве
	for (int i = 0; i < matrix.length; i++) {
	    if (matrix[i][1] > maxRate) {
		maxRate = matrix[i][1];
	    }
	}

	// выбираем минимальный элемент с полученным выше количеством "встречаний"
	for (int i = 0; i < matrix.length; i++) {
	    if (matrix[i][1] == maxRate) {
		maxElem = matrix[i][0];
		break;
	    }
	}

	System.out.println("Наиболее встречающийся элемент: " + maxElem);
    }
}
