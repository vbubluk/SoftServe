package Lesson3.Homework.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    private String name;
    private String LastName;
    private int year;

    public Person() {}
    public Person(String name, String LastName) {}

    public int getAge() {
        return (2021 - year);
    }
    public void changeName(String fn, String ln) {
        name = ln;
        LastName = fn;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть своє ім\'я: ");
        name = br.readLine();
        System.out.println("Введіть своє прізвище: ");
        LastName = br.readLine();
        System.out.println("Введіть рік народження: ");
        year = Integer.parseInt(br.readLine());
    }
    public void output() throws IOException{
        System.out.println("Ваше ім\'я: " + name);
        System.out.println("Ваше прізвище: " + LastName);
        System.out.println("Ваш вік: " + this.getAge());
        System.out.println("______________________________");
    }
}
