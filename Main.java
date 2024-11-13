import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Введите значение a");
        Calculator.a = scanner.nextInt();
        System.out.println("Введите значение b");
        Calculator.b = scanner.nextInt();;
        Calculator.multiplication();
        Calculator.division();
        Calculator.sum(10);
        Calculator.deduct(10);
    }
}