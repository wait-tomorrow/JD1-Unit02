package by.htp.home04.main;

/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют 
 * строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию. 
 * */

public class Task18 {

    public static void main(String[] args) {
	int n = 4;

	findNumbers(n);
    }

    public static void findNumbers(int n) {
	int maxNumber = (int) Math.pow(10, n) - 1;
	for (int i = 100; i < maxNumber; i++) {
	    if (isProgression(i)) {
		System.out.println(i);
	    }
	}
    }

    public static boolean isProgression(int a) {
	int step = 0;
	int prevNumber = 0;
	boolean progression = true;
	boolean firstStep = true;

	while (a > 0) {
	    if (firstStep) {
		step = (a / 10 % 10) - (a % 10);

		if (step == 0) {
		    progression = false;
		    break;
		}

		firstStep = false;
	    } else {
		if ((a % 10) - prevNumber != step) {
		    progression = false;
		    break;
		}
	    }

	    prevNumber = a % 10;
	    a = a / 10;
	}

	return progression;
    }
}
