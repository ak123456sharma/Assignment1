package as7;

import java.util.Scanner;

public class Vowel
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter string");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
         
        System.out.println("string without vowels");
         
        System.out.println(newInputString);
         
        sc.close();
    }
}