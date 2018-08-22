package warmup1;

//Учитывая int n, верните true, если он находится в пределах от 10 до 100 или 200.
// Примечание: Math.abs (num) вычисляет абсолютное значение числа.
public class NearHundred {
    private boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10) {
            return true;
        }
        if (Math.abs(200 - n) <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NearHundred hundred = new NearHundred();
        hundred.nearHundred(0);
        System.out.println(hundred.nearHundred(70));
    }
}
