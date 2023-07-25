package Practice.Conditionals;

import java.util.Scanner;

public class Square_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("length ");
        int length= sc.nextInt();
        System.out.println("Breadth ");
        int breadth= sc.nextInt();
        if(breadth == length){
            System.out.println("It is a square");
        }
        else {
            System.out.println("It is a rectangle");
        }
    }
}
