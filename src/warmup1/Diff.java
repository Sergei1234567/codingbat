package warmup1;

//Учитывая int n, верните абсолютную разницу между n и 21,
// за исключением возврата double абсолютной разницы, если n превышает 21.

public class Diff {
    private int diff21(int n) {
        int i;
        if (n <= 21) {
            i = Math.abs(21 - n);
        } else {
            i = Math.abs((21 - n) * 2);
        }
        return i;
    }

    public static void main(String[] args) {
        Diff d = new Diff();
        d.diff21(0);
        System.out.println(d.diff21(50));
    }
}
