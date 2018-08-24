package warmup1;

public class Diff {
    private int diff21(int n) {
        int result;
        result = n <= 21 ? Math.abs(21 - n) : Math.abs((21 - n) * 2);
        return result;
    }

    public static void main(String[] args) {
        Diff d = new Diff();
        System.out.println(d.diff21(50));
    }
}
