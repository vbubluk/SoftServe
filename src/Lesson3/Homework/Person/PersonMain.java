package Lesson3.Homework.Person;

import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) throws IOException {
        Person first = new Person();
        Person second = new Person();
        Person three = new Person();
        Person four = new Person();
        Person fifth = new Person();


        first.input(); second.input(); three.input(); four.input(); fifth.input();
        first.output(); second.output(); three.output(); four.output(); fifth.output();

    }
}
