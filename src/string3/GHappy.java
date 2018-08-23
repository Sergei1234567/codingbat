package string3;

/*Мы скажем, что строчная буква «g» в строке «счастлива», если есть «g» сразу слева или справа.
        Возвращаем true, если все g в данной строке счастливы.
        gHappy ("xxggxx") → true
        gHappy ("xxgxx") → false
        gHappy ("xxggyygxx") → false*/

public class GHappy {
    public boolean gHappy(String str) {
        if (str.length() == 1 && str.charAt(0) == 'g') {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
                return false;
            }
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GHappy happy = new GHappy();
        String str = "ytugygg";
        System.out.println(happy.gHappy(str));
    }
}
