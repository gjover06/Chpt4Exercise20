/**
Author: George Samu
purpose:The purpose of this program is to generat five random numbers
within the rand of 0.0 to 1.0 using String.format

Date:6/22/2020

*/

import java.util.Scanner;
import java.util.Random;

public class Chpt4Exercise20
{
  public static void main (String []args)
  {
	Scanner keyboard=new Scanner(System.in);
    System.out.println("What is the seed number?");
    long seedNumber=keyboard.nextLong();

    Random generator = new Random(seedNumber);  // 1: .001 .010, .99, .85 ...

    System.out.println("What are the two random number between 0 and 1?");
    //double randomOne= generator.nextInt(10001)/10000.0; // (0-10000)      999 -> .0999, 10000 -> 1.0
    double randomOne= 1.0001 * generator.nextDouble();
    double randomTwo=1.0001 * generator.nextDouble();

    System.out.println("Random number one is "+ String.format("%.4f",randomOne));
    System.out.println("Random number two is "+ String.format("%.4f",randomTwo));

    System.out.println("Three other random numers that range from 0-1");
     double randomThree=1.0001 * generator.nextDouble();
     double randomFour=1.0001 * generator.nextDouble();
     double randomFive=1.0001 * generator.nextDouble();

     System.out.println("Random number three is "+String.format("%.4f",randomThree));
     System.out.println("Random number four is "+String.format("%.4f",randomFour));
     System.out.println("Random number five is "+ String.format("%.4f",randomFive));


  }//end main

}//end Chpt4Exercise