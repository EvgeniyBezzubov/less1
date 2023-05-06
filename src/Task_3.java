import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        char str_3 = in.next().charAt(0);;
        System.out.print(str_3);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();


        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        switch(str_3) {
            case '+': c = a + b;
                System.out.print(c);
                break;
            case '-': c = a - b;
                System.out.print(c);
                break;
            case '*': c = a * b;
                System.out.print(c);
                break;
            case '/': c = a / b;
                System.out.print(c);
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        }
        }

