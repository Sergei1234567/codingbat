package Array2;

/*Учитывая число n, создайте и верните новый массив int длиной n, содержащий числа 0, 1, 2, ... n-1.
Данное n может быть 0, и в этом случае просто вернуть массив длины 0.
Вам не нужен отдельный if-statement для случая length-0; в этом случае цикл for
должен естественным образом выполнять 0 раз, поэтому он просто работает.
Синтаксис для создания нового массива int: new int [wish_length] (См. Также: FizzBuzz Code )
fizzArray (4) → [0, 1, 2, 3]
fizzArray (1) → [0]
fizzArray (10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]*/

import java.util.Arrays;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        FizzArray array = new FizzArray();
        System.out.println(Arrays.toString(array.fizzArray(10)));
    }
}
