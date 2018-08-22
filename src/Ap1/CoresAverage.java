package Ap1;

/*Учитывая массив баллов, вычислите среднее значение средней части первой половины и второй половины
        и верните в зависимости от того, что больше. Мы скажем, что вторая половина начинается с длины индекса / 2.
        Длина массива будет не менее 2. Чтобы практиковать декомпозицию, напишите отдельный вспомогательный метод,
        int average(int[] scores, int start, int end) { который вычисляет среднее значение
        элементов между индексами start..end. Дважды вызовите ваш вспомогательный метод,
        чтобы реализовать scoresAverage (). Напишите свой вспомогательный метод после метода scoresAverage ()
        в текстовой области JavaBat. Обычно вы вычисляете средние значения с удвоениями, но здесь мы используем ints,
        чтобы ожидаемые результаты были точными.
        (4, 4, 2, 2, 2]) → 4
        оценки Среднее ([3, 4, 5, 1, 2, 3]) → 4*/

import java.util.Arrays;

public class CoresAverage {
    public int scoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length / 2);
        int second = average(scores, scores.length / 2, scores.length);
        return Math.max(first, second);
}

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    public static void main(String[] args) {
        CoresAverage av = new CoresAverage();
        int[] scores = {3, 4, 5, 1, 2, 3};
        System.out.println(av.scoresAverage(scores));
    }
}
