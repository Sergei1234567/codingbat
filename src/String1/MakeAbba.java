package String1;

//Если две строки, a и b, возвращают результат объединения их в порядке abba, например,
// «Hi» и «Bye» возвращают «HiByeByeHi».
      /*  makeAbba («Привет», «Bye») → «HiByeByeHi»
        makeAbba («Yo», «Alice») → «YoAliceAliceYo»
        makeAbba («Что», «Вверх») → «WhatUpUpWhat»*/
public class MakeAbba {
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
    }
}
