package Exercise;
import java.util.Scanner;
public class print {
    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0;i <= 3;i++){
                        for (int j = 0;j <= 7;j++){
                            System.out.println("* ");
                        }
                        System.out.print("\n");
                }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0;i <= 5;i++){
                        for (int j = 0;j < i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 5;i > 0;i--){
                        for (int j = 0 ;j < i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
