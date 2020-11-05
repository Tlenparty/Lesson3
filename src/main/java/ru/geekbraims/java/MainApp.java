package ru.geekbraims.java;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    // Задание № 1. Выполнено благодаря курсу "Java быстрый старт, там была похожая задача."
    public static void guessTheNumber() { // Создаем методо, который ничего не возвращает и ничего не принимает
        Random random = new Random(); // Используем класс Random
        Scanner scanner = new Scanner(System.in); // Используем класс Scanner
        int number; // Сюда присвоим рандомное число
        do { //  ДЕЛАЙ
            int guess = -1; // Задаем парметр для будущих попыток угадать число
            int counter = 0; //  Переменная наших попыток. Присваиваем 0 попытку
            number = random.nextInt(10); // присваиваем рандомное число от 0 до 9
            while (counter < 3 && guess != number) { //  Пока не угадаем число и пока попытки не достигнут 3-х выполняем следующее
                System.out.println("Введите число от 0 до 9"); // Выводим на экран для удобства
                guess = scanner.nextInt(); // Присваиваем ввод с клавиатуры число
                if (guess != number) { // Если число введенное с клавиатуры не равно загадонному числу то
                    System.out.println("Ваше число  " + (guess < number ? "меньше" : "больше")); // Тернарный оператор. Введенное число меньше заданного числа?? если да то выдаем "меньше" если нет то "больше"
                    counter++; // Счетчик попыток прибавил 1
                }
            }
            // Сюда попадаем после отработки do while
            System.out.println("Вы " + (guess == number ? "победили" : "проиграли, ответ был " + number)); // Если guess == number то победили , если нет проиграли
            System.out.println("Повторить игру?? Да - 1 , Нет - 0 = "); // Для удобства выводим
        } while (scanner.nextInt() == 1); // Только введенное с клавиатуры число 1 запустит повторно цикл do while
        scanner.close(); // Закрыли поток, сканнер
    }

    /**
     * * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
     * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно, можно пользоваться:
     * String str = "apple";
     * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово
     * Используем только маленькие буквы
     * <p>
     * <p>
     * 1. Обьявляем массив слов (словарный запаса) С какой-то длиной
     * 2. Выбор случайного слова из запаса слов. Проверка на то,чтобы не выйти за границы
     * 3. Цикл (бесконечный) Пока пользователь не догадается
     * 3.1  Заправшиваем слово пользователя. Есть слово пользователя
     * 3.2 Проверим сколько первых букв отг.
     * 3.2 Завожу переменную для ответа maskedAnswer
     * 3.3 Цикл слева - направо при это ( не выйти за границы слова меньше длины)
     * 3.3.1 Сравниваем по буквам.
     * Если равны буквы добавляю в переменную maskedAnswer
     * првоерка на длину слова?
     * Если бувы равны то букву добавляю в  maskedAnswer
     * Елси не равны выхожу из цилка 3.3
     * 3.4 Если maskedAnswer == загаданное слово, то пользователь отгадал
     * ДА - отгадал , выходим, поздравляем
     * НЕТ - еще цикл длина masked Answer до 15
     * добавляем '#' к maskAnswer
     * 4. Игра завершена.
     */


    // Задание № 2
    //  Идем по комментариям по подсказкам с Урока № 4. В скобочках пункты подсказок.
    public static void tryToGuessTheWord() { //  Создали метод который ничего не принимает ничего не возвращает
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", // (1) Создали массив слов.
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random(); // Используем класс Random
        Scanner scanner = new Scanner(System.in); // Используем класс Scanner
        int randomIndex = random.nextInt(words.length - 1); // (2)
        String word = words[randomIndex]; // (3) Присвоили рандомное слово из массива
        String mask = " ";
        for (int i = 0; i < word.length(); i++)
            mask += i + " ";
        while (true) {
            System.out.println(" Угадайте слово. ");
            String answer = scanner.nextLine(); // Присвоили запрос слвоа из консоли.
                        for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < answer.length(); j++) {
                    if (i == j && word.charAt(i) == answer.charAt(j)) {
                        mask = mask.replace(i + "", word.charAt(i) + "");
                    }
                }
            }
            mask = mask.replaceAll("[0-9]", "#");
            System.out.println("mask = " + mask);
        if(word.equals(answer)){
            System.out.println("Победа");
            break;
        }
        }
    }






       /*
    }
  ПОДСКАЗКА РАБОТЫ CHARAT
public class Test {

   public static void main(String args[]) {
      String s = "Я буду хорошим программистом!";
      char result1 = s.charAt(8);
      char result2 = s.charAt(11);
      System.out.println("Восьмой символ строки - " + result1);
      System.out.println("Одиннадцатый символ строки - " + result2);
   }
}
Получим следующий результат:

Восьмой символ строки - о
Одиннадцатый символ строки - ш




    */


        public static void main (String[]args){
            tryToGuessTheWord();

        }
    }







/*
    public static void guessTheWord() {  String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //загадаем слово из массива
        Random random = new Random();
        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        int lenWord = word.length();
        System.out.println("Я загадал слово, попробуй отгадать его");
        System.out.println(word);
        //инициализируем сканер
        Scanner scanner = new Scanner(System.in);
        do {
            //спрашиваем ответ
            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine();
            //если нам надоес играть то мы выйдем
            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            }
            //так как наш игрок не угадал то будем готовить для него подсказку
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }



*/





