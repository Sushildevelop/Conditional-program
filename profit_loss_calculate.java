package Practice.Conditionals;

import java.util.Scanner;

public class profit_loss_calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Selling price");
        int sp= sc.nextInt();
        System.out.println("cost price");
         int cp=sc.nextInt();
         int profit=sp-cp;
         int loss=cp-sp;
        System.out.println(profit);
        System.out.println(loss);
    }

}
