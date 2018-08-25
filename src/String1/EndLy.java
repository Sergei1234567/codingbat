package String1;

//Given a string, return true if it ends in "ly".
//
//        endsLy("oddly") → true
//        endsLy("y") → false
//        endsLy("oddy") → false

public class EndLy {
    public boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EndLy endLy = new EndLy();
        String str = "oddly";
        System.out.println(endLy.endsLy(str));
    }
}
