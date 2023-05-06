import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N треугольного числа: ");
        String str = in.nextLine();
        System.out.println(str);
        int b=Integer.parseInt(str);
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + i;
            System.out.println("sum = " + sum);
        }
    }
}