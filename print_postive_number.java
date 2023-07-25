package Practice.Conditionals;

import java.util.Scanner;

public class print_postive_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number");
        int x=sc.nextInt();
        if(x>=0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("You number is negative and is skipped");

        }
    }
}
