package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssigmentOne {

    public static void fileRead(String filepath) throws FileNotFoundException {
        File file = new File("file1");

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
