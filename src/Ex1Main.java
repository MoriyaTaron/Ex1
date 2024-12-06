import java.util.Arrays;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure yo ur implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) {
                System.out.println("num1="+num1+ " is number: "+Ex1.isNumber(num1)+" value: "+Ex1.number2Int(num1));
                if (!Ex1.isNumber(num1)){
                    System.out.println("the number num1 is in the wrong format you can try again... ");
                }else {
                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program)");
                    num2= sc.next();
                    if (!num2.equals("quit")){
                        System.out.println("num2="+num2+" is number: "+Ex1.isNumber(num2)+" value: "+Ex1.number2Int(num2));
                        if (!Ex1.isNumber(num2)){
                            System.out.println("the number num2 is in the wrong format you can try again... ");
                        }
                        else {
                            System.out.println("Enter a base for output: number between 2 to 16");
                            int base = sc.nextInt();
                            if (base<2||base>16){
                                System.out.println("That's not what i asked for you can try it all again....");
                            }else {
                                int plus = Ex1.number2Int(num1)+Ex1.number2Int(num2);
                                int mult= Ex1.number2Int(num1)*Ex1.number2Int(num2);
                                String[] solutions= {num1,num2,Ex1.int2Number(plus,base),Ex1.int2Number(mult,base)};
                                System.out.println(num1+" + "+num2+" = "+Ex1.int2Number(plus,base));
                                System.out.println(num1+" * "+num2+" = "+Ex1.int2Number(mult,base));
                                System.out.println("Max number over"+ Arrays.toString(solutions)+"is: "+solutions[Ex1.maxIndex(solutions)]);

                            }
                        }
                    }

                }

                /////////////////////
            }
        }
        System.out.println("quiting now...");
    }
}
