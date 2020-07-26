package home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String str = " Тесты, тестик.. тестов,  -  теста !!";
    System.out.println(str);

    // Задание 18
    String[] prep = new String[]{".", "?", "!", ",", ";", ":", "-"};
    int count = 0;
    for (char i : str.toCharArray()) {
      for (String j : prep) {
        if (String.valueOf(i).equals(j)) {
          count++;
        }
      }
    }

    //Задание 19
    Pattern p = Pattern.compile("[а-яА-Я]+");
    Matcher m = p.matcher(str);
    int countWord = 0;
    while (m.find()) {
      countWord++;
    }

    //Задание 20
    StringBuilder word = new StringBuilder();

    Pattern pattern = Pattern.compile("([а-яА-Я]+)");
    Matcher matcher = pattern.matcher(str);

    while (matcher.find()) {
      word.append(str, matcher.end() - 1, matcher.end());
    }

    //Задание 21
    int n = 5;
    int a = 0;
    int b = 0;
    String strALot = str;
    while (a < n) {
      strALot += str;
      a++;
    }

    StringBuilder strALotNew = new StringBuilder(str);
    while (b < n) {
      strALotNew.append(str);
      b++;
    }

    System.out.println("В тексте " + count + " знаков пунктуации");
    System.out.println("Количество слов в тексте : " + countWord);
    System.out.println("Слово составленное из последних букв слов в тексте : " + word);
    System.out.println("Текст методом сложения : " + strALot);
    System.out.println("Текст с помощью append : " + strALotNew);

  }
}
