import java.util.Scanner;

public class Magic {
    public static void main(String [] args){
        //declare
        Scanner keyboard;
        int testing;
        String question;



       //intialization phase
       keyboard = new Scanner(System.in);
       System.out.println("What information do you seek? Enter a number alongside your question");
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
       if (testing<=20&&testing>=30) {
           System.out.println("Without a doubt.");
       }
       else if (testing>&&esting<30) {
           System.out.println("Very Doubtful");
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