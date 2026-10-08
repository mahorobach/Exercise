import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BeginnerExercise2_3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> studentMap = new HashMap<>();

    while(true) {
      System.out.println("===学生管理===");
      System.out.println("1.学生を追加");
      System.out.println("2.学生を削除");
      System.out.println("3.点数を更新");
      System.out.println("4.平均点を計算");
      System.out.println("5.全学生の情報を表示");
      System.out.println("6.終了します");
      System.out.println("選択してください");

      String select = scanner.next();

      switch (select) {

        case "1": {
          System.out.println("名前を入力してください");
          String name = scanner.next();

          int score;

          while (true) {
            System.out.println("点数を入力してください");
            String scoreText = scanner.next();

            scoreText = Normalizer.normalize(scoreText, Form.NFKC);

            if (scoreText.matches("[0-9]+")) {
              score = Integer.parseInt(scoreText);
              break;
            } else {
              System.out.println("数字ではありません。もう一度入力してください");
            }
          }

          studentMap.put(name, score);
          break;
        }

        case "2": {
          System.out.println(studentMap);
          System.out.println("学生を削除します。削除する名前を入力してください。");
          String name = scanner.next();

          if (studentMap.containsKey(name)){
            studentMap.remove(name);
          } else {
            System.out.println("その学生は登録されていません");
          }

          System.out.println(studentMap);
          break;
        }
        case "3": {
          System.out.println(studentMap);
          System.out.println("点数を修正します。修正する学生の名前を入力してください");
          String name = scanner.next();

          System.out.println("点数を入力してください");
          int score = scanner.nextInt();

          studentMap.put(name, score);
          System.out.println(studentMap);
          break;
        }
        case "4": {
          System.out.println("平均点を計算します");
          int total = studentMap.values().stream().mapToInt(score -> score).sum();
          double average = (double) total / studentMap.size();
          System.out.println("平均点は" + average + "点です。");
          break;
        }
        case "5":{
          System.out.println("一覧を表示します");

          studentMap.forEach((name, score) -> {
            System.out.println(name + ":" + score + "点");
          });
          break;
}
        case "6":
          System.out.println("プログラムを終了します");
          return;

        default:
          System.out.println("1~6を入力してください");

      }
    }
  }
}
