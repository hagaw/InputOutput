package InputOutp;

import java.net.SocketPermission;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int avrageAmount;
        int largestNumber;


        Scanner inputOutPut=new Scanner(System.in);


        System.out.println("please inter the first number");
        firstNumber=inputOutPut.nextInt();

        System.out.println("please inter the soconed number");

            secondNumber=inputOutPut.nextInt();
            avrageAmount=firstNumber+secondNumber;

            largestNumber=((firstNumber)+(secondNumber))/2;

               if(firstNumber>secondNumber){
                   System.out.println(firstNumber +"is the largaes Number");
               }else if (firstNumber<secondNumber){
                   System.out.printf("The second numbe is largr");
               }
               else{
                   System.out.println("They are equal");
               }
            System.out.println (avrageAmount + "ist the devided value"  );
	// write your code here
    }
}
