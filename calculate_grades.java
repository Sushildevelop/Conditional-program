package Practice.Conditionals;

public class calculate_grades {
    public static void main(String[] args) {
        int marks=70;
        if (marks >=90){
            System.out.println("A+");
        } else if (marks>=80 ) {
            System.out.println("A");
            
        } else if (marks>=70) {
            System.out.println("B+");
        }
        else if (marks>=60){
            System.out.println("B");
        } else if (marks >=50) {
            System.out.println("C");
        } else if (marks >=40) {
            System.out.println("D");
        }
        else{
            System.out.println("Fails");
        }
    }
}
