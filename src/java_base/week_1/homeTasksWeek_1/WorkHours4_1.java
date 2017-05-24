package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.1. The user enters the parameter from the console (the current hour is from 0 to 24)
 If the time is from 9 to 18, then we deduce "I'm at work", in another case "I rest") */

public class WorkHours4_1 {
    public static  void main (String[] args){

        System.out.println("Enter value from 0 to 24");

        Scanner scanner  = new Scanner (System.in);
        int hour =  scanner.nextInt();

        if( hour>=0  && hour <9 ){
            System.out.println("I rest");
        } else if (hour >= 9 && hour <=18) {

            System.out.println("I am at work");
        } else if (hour>=19 && hour <=24) {

            System.out.println("I rest");

        } else if (hour < 0 || hour > 24){
            System.out.println("You enter value more than 24");
        }



    }
}
