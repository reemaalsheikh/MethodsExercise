import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*1.Write a Java method to find the smallest number among three numbers.
* Test Data:
* Input the first number: 25
* Input the Second number: 37
* Input the third number: 29
* Expected Output:
The smallest value is 25.0 */

        /*
        System.out.print("Please input the first number: ");
        double firstNumber = input.nextInt();
        System.out.print("Please input the second number: ");
        double secondNumber = input.nextInt();
        System.out.print("Please input the third number: ");
        double thirdNumber = input.nextInt();

        System.out.println("The smallest value is:"+smallest(firstNumber, secondNumber, thirdNumber));
*/








    /* 2. Write a Java method that check if the entered number is negative or positive or zero. */

        /*
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        check(number); */









    /* 3 - Write a Java method to check whether a string is a valid password.
     Password rules:
     A password must have at least eight characters.
     A password consists of only letters and digits.
     A password must contain at least two digits.

    Expected Output:
    1. A password must have at least eight characters.
    2. A password consists of only letters and digits.
    3. A password must contain at least two digits
    Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
    Password is valid: abcd1234
     */

/*
     System.out.println(" 1. A password must have at least eight characters.\n" +
                " 2. A password consists of only letters and digits.\n" +
                " 3. A password must contain at least two digits\n" +
             "Please Input a password (You are agreeing to the above Terms and Conditions.):");
     String password = input.nextLine();

      if(isvalidPassword(password)){
          System.out.println("Password is Valid:"+ password);
      }else{
          System.out.println("Invalid Password:"+ password);
      }

*/


    } //End of main


    //Mesthod for the 1st Question

    public static double smallest(double a, double b, double c) {

       if (a < b && a < c) {
            return a;
        }else if (b < c && b < c) {
            return b;
        }else
            return c;
    }

    //Method for the second Question

    public static void check (int number) {
        if (number > 0){
            System.out.println("The entered number is a positive number.");
        }
        else if (number < 0) {
            System.out.println(" The entered number is a negative number.");
            }
        else if(number==0) {
            System.out.println(" The entered number is zero.");
            }
    }



    //Method for the third Question

    public static boolean isvalidPassword (String password) {
        if (password.length()< 8) {
            return false;
        }else {
            int counter = 1;
            char c;
            for (int i = 0; i < password.length()-1; i++) {
                c = password.charAt(i);

                if (!Character.isLetterOrDigit(c)) {
                    return false;
                }
                else if (Character.isDigit(c)) {
                    counter++;

                    if (counter < 2) {
                        return false;
                    }
                }


            }
        }
        return true;
    }







    }
