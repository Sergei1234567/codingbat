package Ap1;

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
