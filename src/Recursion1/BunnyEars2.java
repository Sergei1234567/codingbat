package Recursion1;

/*У нас есть кролики, стоящие в линии, пронумерованные 1, 2, ...
        У нечетных кроликов (1, 3, ..) есть нормальные 2 уха.
        Четные кролики (2, 4, ..), мы скажем, имеем 3 уха, потому что каждый из них имеет поднятую ногу.
        Рекурсивно возвращаем количество «ушей» в линии 1, 2, ... n (1), (без циклов или умножения).
        bunnyEars2 (0) → 0
        bunnyEars2 (1) → 2
        bunnyEars2 (2) → 5*/

public class BunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        }
        return 3 + bunnyEars2(bunnies - 1);
    }

    public static void main(String[] args) {
        BunnyEars2 ears2 = new BunnyEars2();
        System.out.println(ears2.bunnyEars2(1));
    }
}
