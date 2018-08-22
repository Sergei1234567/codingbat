package String1;

/*Учитывая 2 строки, верните их конкатенацию,
        за исключением опускания первого символа каждого из них.
        Строки будут иметь длину не менее 1.*/

public class NonStart {
    private static String nonStart(String a, String b) {
        return a.substring(1, a.length()).concat(b.substring(1, b.length()));
     /* a = a.substring(1, a.length());
      b = b.substring(1, b.length());
      String result = a.concat(b);
      return result;*/
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Tomy", "Ysi"));
    }
}
