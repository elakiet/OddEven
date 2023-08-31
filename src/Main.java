// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        System.out.println(even_odd(number));
    }
    static String even_odd(int number)
    {
        if (number%2==0)
        {
            return "The Number is even";
        }
        else
        {
            return "The Number is odd";
        }
    }
}