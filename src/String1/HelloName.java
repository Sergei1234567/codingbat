package String1;

//Учитывая имя строки, например «Боб», верните приветствие формы «Hello Bob!».
//helloName («Боб») → «Привет, Боб!»
//helloName («Алиса») → «Привет, Алиса!»
//helloName ("X") → "Hello X!"

public class HelloName {
    private static String helloName(String name) {
       // name = "Bob";
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
    }
}
