import java.util.Scanner;

public class TaskTwoPointOne {

    public static void main(String[] args) {
        System.out.println("Enter your grades");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        if ( c > max ) {
            System.out.println("Your minimum Grade is ! " + min);
            System.out.println("Your maximum Grade is ! " + c);
        } else if ( c < min) {
            System.out.println(("Your minimum Grade is ! " + c));
            System.out.println("Your maximum Grade is ! " +max);

        } else if ( a == b || a ==c ){
            System.out.println("The Application could not figure minimum and maximum Grades !");
        }
    }
}
