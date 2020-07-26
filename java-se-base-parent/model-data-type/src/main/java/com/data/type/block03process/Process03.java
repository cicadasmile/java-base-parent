package com.data.type.block03process;

import java.util.Scanner;

/**
 * Switch 语句
 */
public class Process03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What day is it today：");
        String value = scan.next();
        weekInfo(value);
    }

    private static void weekInfo (String value){
        switch (value) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Matching failure");
                break;
        }
    }
}
