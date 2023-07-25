package Practice.Conditionals;

import java.util.Scanner;

public class switch_add_mul_div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String cases=sc.next();
        switch (cases){
            case "Add":
                int a= sc.nextInt();
                int b= sc.nextInt();
                System.out.println(a+b);
                break;
            case "Multiple":
                int x= sc.nextInt();
                int y= sc.nextInt();
                System.out.println(x*y);
                break;
            case "Div":
                int z= sc.nextInt();
                int w= sc.nextInt();
                System.out.println(z/w);
                break;
            default:
                System.out.println("No ");
        }
    }
}
