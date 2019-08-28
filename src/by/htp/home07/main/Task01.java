package by.htp.home07.main;

import java.util.Random;

/*
 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
 * чтобы в одной строке была ровно одна единица, и вывести на экран. 
 * */

public class Task01 {

    public static void main(String[] args) {
	int a[][] = new int[3][4];
	Random random = new Random();

	for (int i = 0; i < 3; i++) {
	    boolean hasOne = false;

	    for (int j = 0; j < 4; j++) {
		if (!hasOne) {
		    a[i][j] = random.nextInt(2);
		    if (a[i][j] == 1) {
			hasOne = true;
		    } else if (j == 3) {
			a[i][j] = 1;
			// если это последний символ в строке, а единиц в строке нет,
			// то ставим 1 на последнее место в строке
		    }
		} else {
		    a[i][j] = 0;
		}
	    }
	}

	Utils.printMatrix(a);
    }
}
