package by.htp.home07.main;

import java.util.Random;

/*
 * 2. Создать и вывести на экран матрицу 2 x 3, 
 * заполненную случайными числами из [0, 9]. 
 * */

public class Task02 {

    public static void main(String[] args) {
	int a[][] = new int[2][3];
	Random random = new Random();

	for (int i = 0; i < 2; i++) {
	    for (int j = 0; j < 3; j++) {
		a[i][j] = random.nextInt(10);
	    }
	}

	Utils.printMatrix(a);
    }
}
