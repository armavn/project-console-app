package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static class AssigmentOne {

        public static void fileRead(String filepath) throws FileNotFoundException {
            File file = new File(filepath);

            Scanner scan = new Scanner(file);
            String[] fileString = new String[100];

            int counter = 0;

            while (scan.hasNextLine()){
                fileString[counter] = scan.nextLine();
                counter++;
            }

            split(fileString);
        }


        public static void split(String[] arr){
            for (int i = 0; i < arr.length; i++){
                String[] numberString = arr[i].split(", ");
                casting(numberString);
            }
        }

        public static void casting(String[] numbers){
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            Point point = new Point(x, y);
        }

    }


    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,1 );
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 0);


        Shape polynomial  = new Shape();
        polynomial.addPoint(p1);
        polynomial.addPoint(p2);
        polynomial.addPoint(p3);
        polynomial.addPoint(p4);


        System.out.println(polynomial.longestSide());
        System.out.println(polynomial.avarageSide());
        System.out.println(polynomial.perimeter());



    }
}
