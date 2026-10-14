# Guess Games

Две консольные игры на Java:

- **Угадай слово** (по умолчанию) — компьютер загадывает слово из списка фруктов
  и овощей; после каждой неверной попытки показывается маска из 15 символов,
  где открыты буквы, стоящие на своих местах, а остальные заменены на `#`.
- **Угадай число** (`number`) — число от 0 до 9, три попытки с подсказкой
  «больше/меньше» и предложением сыграть ещё раз.

## Запуск

Требуется JDK 8+.

```bash
mvn package
java -cp target/classes com.tlenparty.guessgame.MainApp          # угадай слово
java -cp target/classes com.tlenparty.guessgame.MainApp number   # угадай число
```

Без Maven: `javac -d out src/main/java/com/tlenparty/guessgame/MainApp.java`.
