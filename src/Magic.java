import java.util.Scanner;

public class Magic {
    public static void main(String [] args){
        //declare
        Scanner keyboard;
        int testing;
        String question;



        //intialization phase
        keyboard = new Scanner(System.in);
        System.out.println("Greetings, I am the Magic8Ball!\nWhat information do you seek?");
        System.out.println("Ask me any yes or no question and see what fate has in store for you!");
        question = keyboard.nextLine();
        System.out.println("Enter a number between 1 and 100");
        testing= keyboard.nextInt();
        System.out.println(question);
        if (testing<=10&&testing>=0) {
            System.out.println("It is certain.");
        }
        else if(testing>10&&testing<21) {
            System.out.print("Don't count on it.");
        }
        if (testing>20&&testing<=30) {
            System.out.println("Without a doubt.");
        }
        else if (testing>30&&testing<=40) {
            System.out.println("Very Doubtful.");
        }
        if (testing>=41&&testing<=50) {
            System.out.println("Signs point to yes.");
        }
        else if (testing>50&&testing<=60){
            System.out.println("Signs point to no.");
        }
        if (testing>=61&&testing<=70){
            System.out.println("You may rely on it.");
        }
        else if (testing>70&&testing<=80){
            System.out.println("Don't rely on it.");
        }
        if (testing>=81&&testing<=90){
            System.out.println("Yes.");
        }
        else if (testing>90&&testing<=100){
            System.out.println("No.");
        }



    }
}
/*
10 different choices - 5 positve 5 negative


use the input from the user and a number they give you between 1 and 100
0-10: It is certain
11-20: Don't count on it
21-30: Without a doubt
31-40: Very doubtful
41-50: signs point to yes
51-60: signs point to no
61-70: you may rely on it
71-80: don't rely on it
81-90: Yes
91-100: No

 */