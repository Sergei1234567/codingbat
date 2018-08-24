package warmup1;

public class SleepinH {
    public boolean sleepin(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepinH sleep = new SleepinH();
        System.out.println(sleep.sleepin(false, true));
    }
}
