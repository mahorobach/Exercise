import java.util.Scanner;

public class BeginnerExercise1_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("１番目の数字を入力してください:");
    while (!scanner.hasNextDouble()) {
      System.out.println("数字ではありません。数字を入力してください");
      scanner.next();
    }
      double number1 = scanner.nextDouble();

      System.out.println("演算子を入力してください (+, -, *, /):");
      String operator = scanner.next();
      System.out.println("２番目の数字を入力してください:");
    while (!scanner.hasNextDouble()) {
      System.out.println("数字ではありません。数字を入力してください");
      scanner.next();
    }
      double number2 = scanner.nextDouble();

      switch (operator) {
        case "+":
          System.out.println(number1 + number2);
          break;
        case "-":
          System.out.println((number1 - number2));
          break;
        case "*":
          System.out.println((number1 * number2));
          break;
        case "/":
          if (number2 != 0) {
            System.out.println((number1 / number2));
          } else {
            System.out.println("0で割ることはできません");
          }
          break;
      }

    }
  }

