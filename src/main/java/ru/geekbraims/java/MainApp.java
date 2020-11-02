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
            int guess =-1; // Задаем парметр для будущих попыток угадать число
            int counter=0; //  Переменная наших попыток. Присваиваем 0 попытку
            number = random.nextInt(10); // присваиваем рандомное число от 0 до 9
             while (counter < 3 && guess != number) { //  ПОКА не угадаем число и пока попытки не достигнут 3-х выполняем следующее
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

   /* // Задание № 2
    public static void guessTheWord() { // Создали метод который ничего не принимает ничего не возвращает
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", // Копипастнули массив
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random(); // Используем класс Random
        Scanner scanner = new Scanner(System.in); // Используем класс Scanner
        String str; // Сюда присвоим рандомную строку из массива
        int randomIndex = random.nextInt(words.length-1);
        do {
            String guess = null; // Задаем пустое значение для будущих попыток угадать строку.
            int counter = 0; //  Переменная наших попыток. Присваиваем 0 попытку
            System.out.println("Отгадайте фрукт");
            str = words[randomIndex]; // Задаем рандомное значение для фруктового массива
            while(counter<3 && guess.equals(str)){ // Пока счетчик не достигнет 3 и пока не будет сходства строк
                System.out.println("Введите Вашу догадку");
                guess = scanner.nextLine(); // Ввод возможного варианта фрукта
                if(guess.equals(str)){ // Сравниваем строки введеную с загаданной
                    System.out.println("Ваш ответ" + guess.equals(str)+ "***************"); // ответ сравниваем с заданным рандомным фруктом из массива
                    counter++; // Счетчик попыток
                }
            }
            System.out.println("Вы" + (guess.equals(str)?"Победили":"Проигали" + str) );
        }while (scanner.nextInt() == 1); // Только введенное с клавиатуры число 1 запустит повторно цикл do while
        scanner.close(); // Закрыли поток, сканнер
    }
    public static void main(String[] args) {
       // guessTheNumber();
        guessTheWord();
    }
}
    */
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





    public static void main(String[] args) {
        guessTheNumber();
    }
}



