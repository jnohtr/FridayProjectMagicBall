package com.company;

import java.util.Scanner;
import java.util.Random;

public class FridayProjectMagicBall{

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);

        //String another = "y";

        int num = 1;
        while (num != 2) {

            System.out.print("YOU ASKED: ");
            String ask = keyboard.nextLine();
            //String respond = keyboard.nextLine();
            /*System.out.println( ask );*/
            //String choice = keyboard.nextLine();


            //String another = keyboard.next();
            //while (another != "n") {
            //System.out.print("YOU ASKED: ");
            //String ask = keyboard.nextLine();

            Random r = new Random();
        /*int x = 1 + r.nextInt(10);

        System.out.println( 1+ r.nextInt(5));
        System.out.println( 1+ r.nextInt(5));
        System.out.println( 1 + r.nextInt( 100 ));*/

            int choice = 1 + r.nextInt(20);
            String response = "";

            if (choice == 1)
                response = "● It is certain";
            else if (choice == 2)
                response = "● It is decidedly so";
            else if (choice == 3)
                response = "● Without a doubt";
            else if (choice == 4)
                response = "● Yes definitely";
            else if (choice == 5)
                response = "● You may rely on it";
            else if (choice == 6)
                response = "● As I see it, yes";
            else if (choice == 7)
                response = "● Most likely";
            else if (choice == 8)
                response = "● Outlook good";
            else if (choice == 9)
                response = "● Yes";
            else if (choice == 10)
                response = "● Signs point to yes";
            else if (choice == 11)
                response = "● Reply hazy try again";
            else if (choice == 12)
                response = "● Ask again later";
            else if (choice == 13)
                response = "● Better not tell you now";
            else if (choice == 14)
                response = "● Cannot predict now";
            else if (choice == 15)
                response = "● Concentrate and ask again";
            else if (choice == 16)
                response = "● Don't count on it";
            else if (choice == 17)
                response = "● My reply is no";
            else if (choice == 18)
                response = "● Outlook not so good";
            else if (choice == 19)
                response = "● My sources say no";
            else if (choice == 20)
                response = "● Very doubtful";
            else
                response = "tired today";

            System.out.println("MAGIC 8-BALL SAYS: " + response);
            //System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            System.out.println("Do you have another question for the Magic 8-Ball? (yes:1 /no:2)");
//done whatever
            //int another = keyboard.nextInt();

            num = keyboard.nextInt();
//if user says yes great you want to continue?
            ask ="";
            //keyboard.nextInt();
            keyboard.nextLine();

            //int num = keyboard.nextInt();
            //String num = keyboard.next();

        /*while ( another != 1) {
            System.out.println( "MAGIC 8-BALL SAYS: " + response );
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            /*another = keyboard.nextInt();
            System.out.print("YOU ASKED: ");
            ask = keyboard.nextLine();*/

        /*while (num != 2){
            System.out.println("MAGIC 8-BALL SAYS: " + response);
            System.out.println("Do you have another question for the Magic 8-Ball? (1/n)");
            num = keyboard.nextInt();
            //num = keyboard.next();



            //System.out.println("MAGIC 8-BALL SAYS: " + response);

            System.out.println("YOU ASKED: ");
            ask = keyboard.nextLine();
        }*/

        }

    }
}





    //}

