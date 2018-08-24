package warmup1;

public class NearHundred {
    private boolean nearHundred(int n) {
        return n >= 10 && n <= 200;
    }

    public static void main(String[] args) {
        NearHundred hundred = new NearHundred();
        System.out.println(hundred.nearHundred(70));
    }
}
