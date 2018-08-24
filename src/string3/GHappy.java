package string3;

public class GHappy {
    private boolean gHappy(String str) {
        if (str.length() == 1) {
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
        String str = "";
        System.out.println(happy.gHappy(str));
    }
}
