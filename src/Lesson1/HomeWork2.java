package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String answer1 = br.readLine();
        System.out.println("Where are you live, " + answer1 + "?");
        String answer2 = br.readLine();
        System.out.println("Your name is " + answer1 + ". " + "You live in" + answer2 + ".");
    }
}
