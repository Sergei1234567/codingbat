package Ap1;

/*Учитывая положительный int n, верните true, если он содержит 1 цифру.
 Примечание: используйте % , чтобы получить самую правую цифру, и /, чтобы сбросить самую правую цифру.
        hasOne (10) → true
        hasOne (22) → false
        hasOne (220) → false*/

public class HasOne {
    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }


    

    public static void main(String[] args) {
        HasOne one = new HasOne();
        int n = 56156;
        System.out.println(one.hasOne(n));
    }
}
