package by.htp.home07.main;

/*25. Получить квадратную матрицу порядка n: 
 * 
 *     1  	2    ...   n-1   n
 *    n+1      n+2   ...  2n-1  2n
 *   2n+1     2n+2   ...  3n-1  3n  
 *    .         .    .      .   .
 *    .         .     .     .   .
 *    .         .      .    .   . 
 * (n-1)n+1 (n-1)n+2 ... n^2+1  n^2
 * 
 * */

public class Task25 {

    public static void main(String[] args) {
	int n = 6;
	int matrix[][] = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = (i * n) + j + 1;
	    }
	}

	Utils.printMatrix(matrix);
    }
}
