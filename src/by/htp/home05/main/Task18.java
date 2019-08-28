package by.htp.home05.main;

import java.util.Random;

/*
 * 18*. «Суперзамок». 
 * Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, 
 * в которые надо вставить игральные кубики. Но дверь открывается только в том случае, 
 * когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек). 
 * Напишите программу, которая разгадывает код замка при условии, 
 * что два кубика уже вставлены в ячейки. 
 * */

public class Task18 {

    public static void main(String[] args) {
	int safe[] = new int[10];
	set2Elem(safe);
	Utils.printArray(safe);

	hack(safe);
    }

    public static void hack(int safe[]) {
	int fixedElem1 = getFixedElemIndex(safe, 1);
	int fixedElem2 = getFixedElemIndex(safe, 2);
	initHackProcess(safe);

	// Никакой хитрой логики, тупой перебор всех возможных значений
	boolean hacked = false;
	while (!hacked) {
	    // Прибавляем 1 к последнему элементу
	    safe[safe.length - 1]++;

	    // Если последний элемент стал больше 6,
	    // то добавляем 1 к предыдущему элементу. И т.д.
	    if (addRazrAndCheckLastAttempt(safe, fixedElem1, fixedElem2)) {
		break;
	    }
	    hacked = tryToHack(safe);
	}

	if (hacked) {
	    Utils.printArray(safe);
	} else {
	    System.out.println("Этот сейф невозможно взломать перебором.");
	    System.out.println("Воспользуйтесь терморектальным криптоанализом...");
	}
    }

    public static boolean tryToHack(int a[]) {
	for (int i = 1; i < a.length - 1; i++) {
	    if (a[i - 1] + a[i] + a[i + 1] != 10) {
		return false;
	    }
	}

	return true;
    }

    // метод решает 2 задачи, но разнести не получается
    public static boolean addRazrAndCheckLastAttempt(int a[], int fixed1, int fixed2) {
	int addRazr = 0;
	for (int i = a.length - 1; i >= 0; i--) {
	    if (i != fixed1 && i != fixed2) {
		a[i] = a[i] + addRazr;
		addRazr = 0;
	    }

	    if (a[i] > 6) {
		a[i] = 1;
		addRazr++;
	    }
	}

	// если невозможно добавить +1 к предыдущему разряду
	// из-за перебора всех вариантов или
	// если зафиксированные элементы находятся на 0 индексе (или 0+1)
	if (addRazr > 0) {
	    return true;
	}
	return false;
    }

    public static void set2Elem(int a[]) {
	Random rand = new Random();

	while (true) {
	    a[rand.nextInt(10)] = rand.nextInt(6) + 1;

	    // должно быть заполнено только 2 элемента
	    // цикл нужен, чтобы исключить варианты, когда Великий Рандом 
	    // несколько раз направляет перст указующий на один и тот же индекс
	    int count = 0;
	    for (int i = 0; i < a.length; i++) {
		if (a[i] != 0) {
		    count++;
		}
	    }

	    if (count >= 2) {
		break;
	    }
	}
    }

    // заполняет свободные элементы массива единицами
    // ну, на кубике же нулей нет, нет смысла перебирать такие варианты
    public static void initHackProcess(int safe[]) {
	for (int i = 0; i < safe.length; i++) {
	    if (safe[i] == 0) {
		safe[i] = 1;
	    }
	}
    }

    public static boolean checkSum(int safe[]) {
	for (int i = 0; i < safe.length - 3; i++) {
	    int sum = safe[i] + safe[i + 1] + safe[i + 2];

	    if (sum == 10) {
		System.out.println("Got it!!!");
		return true;
	    }
	}

	return false;
    }

    // возвращает индекс указанного зафиксированного элемента
    // (numItem должно иметь значение 1 или 2)
    public static int getFixedElemIndex(int safe[], int numItem) {
	int count = 0;

	for (int i = 0; i < safe.length; i++) {
	    if (safe[i] != 0) {
		count++;

		if (count == numItem) {
		    return i;
		}
	    }
	}

	return -1;
    }
}
