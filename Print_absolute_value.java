package Practice.Conditionals;

import java.util.Scanner;

public class Print_absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number");
        int num= sc.nextInt();
        if (num<0){
            num=num*-1;
        }
        System.out.println(num);
    }
}
