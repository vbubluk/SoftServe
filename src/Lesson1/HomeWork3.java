package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Country?");
            double price1 = Double.parseDouble(br.readLine());
            System.out.println("Time?");
            double time1 = Double.parseDouble(br.readLine());
        System.out.println("Country?");
            double price2 = Double.parseDouble(br.readLine());
            System.out.println("Time?");
            double time2 = Double.parseDouble(br.readLine());
        System.out.println("Country?");
            double price3 = Double.parseDouble(br.readLine());
            System.out.println("Time?");
            double time3 = Double.parseDouble(br.readLine());
        double country1 = price1 * time1;
        double country2 = price2 * time2;
        double country3 = price3 * time3;
        System.out.println("Country 1 - " + country1);
        System.out.println("Country 2 - " + country2);
        System.out.println("Country 3 - " + country3);
        System.out.println("All - " + (country1 + country2 + country3));
    }
}
