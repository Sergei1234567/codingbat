package warmup1;

public class Front3 {
    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String temp = str.substring(0, 3);
        return temp + temp + temp;
    }

    public static void main(String[] args) {
        Front3 fr = new Front3();
        System.out.println(fr.front3("java"));
    }
}
