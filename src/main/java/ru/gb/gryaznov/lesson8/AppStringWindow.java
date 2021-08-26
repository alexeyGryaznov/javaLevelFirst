package ru.gb.gryaznov.lesson8;

import java.util.Random;
import java.util.Scanner;

public class AppStringWindow {
    public static void main(String[] args) {

        new myWindow();
        new myWindow2();
        new myWindow3();
        new myWindow4();
        new myManWindow();
//*
        String[] words;
        words= new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int x = rand.nextInt(words.length);
        System.out.println("компьютер загадал слово");
        System.out.println(words[x]);
        Scanner sc = new Scanner(System.in);
        String myWord;
        String compWord = words[x];
        String rezultWord;
        do {
            myWord=sc.next();
            for (int j = 0; j < compWord.length(); j++) {
                if (myWord.charAt(j) == compWord.charAt(j)) {
                    rezultWord = String.valueOf(compWord.charAt(j));
                } else {
                    rezultWord = "*";
                }
                System.out.print(rezultWord);
            }
        }
        while (!(compWord.equals(myWord)));


    }
}
