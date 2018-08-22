package warmup1;

//Параметр weekday имеет значение true, если это день недели, а отпуск параметров - это истина,
// если мы находимся в отпуске. Мы спим, если это не будний день или мы в отпуске.
// Верните true, если мы спим.
//sleepIn (false, false) → true
//sleepIn (true, false) → false
//sleepIn (false, true) → true

public class SleepinH {
    public boolean sleepin(boolean weekday, boolean vacation) {
        return !weekday || vacation;
     /*   if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        }else if(!weekday && vacation){
            return true;
        }else {
            //do nothing
        }
        return true;*/
    }

    public static void main(String[] args) {
        SleepinH sleep = new SleepinH();
        sleep.sleepin(true, false);
        System.out.println(sleep.sleepin(false,true));
    }
}
