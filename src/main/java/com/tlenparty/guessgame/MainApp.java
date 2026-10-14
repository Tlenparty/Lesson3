package com.tlenparty.guessgame;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    // Игра "Угадай число": 3 попытки, подсказка больше/меньше
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


    public static void tryToGuessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String word = words[random.nextInt(words.length)];
        System.out.println("Я загадал слово, попробуйте отгадать его (Enter — выход)");

        while (true) {
            System.out.println("Ваш ответ: ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.isEmpty()) {
                System.out.println("Загаданное слово: " + word);
                break;
            }
            if (word.equals(answer)) {
                System.out.println("Победа! Вы угадали слово");
                break;
            }
            // Подсказка: буквы, стоящие на своих местах, остальное — '#', всего 15 символов
            StringBuilder mask = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                if (i < word.length() && i < answer.length() && word.charAt(i) == answer.charAt(i)) {
                    mask.append(word.charAt(i));
                } else {
                    mask.append('#');
                }
            }
            System.out.println(mask);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("number")) {
            guessTheNumber();
        } else {
            tryToGuessTheWord();
        }
    }
}
