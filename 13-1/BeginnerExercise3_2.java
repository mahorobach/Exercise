import java.util.Scanner;

public class BeginnerExercise3_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("携帯電話番号を入力してください:");
    String phoneNumber = scanner.next();
    if (phoneNumber.matches("0\\d{2}-\\d{4}-\\d{4}")) {
      System.out.println(phoneNumber + "は有効な携帯電話番号です");
    } else {
      System.out.println("携帯電話番号ではありません");
    }


  }
}
