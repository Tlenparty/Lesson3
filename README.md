# Guess Games

Two console games in Java:

- **Guess the word** (default): the computer picks a word from a list of fruits
  and vegetables; after each wrong attempt a 15-character mask is shown,
  in which letters in their correct positions are revealed and the rest are replaced with `#`.
- **Guess the number** (`number`): a number from 0 to 9, three attempts with a
  "higher/lower" hint and an offer to play again.

## Run

Requires JDK 8+.

```bash
mvn package
java -cp target/classes com.tlenparty.guessgame.MainApp          # guess the word
java -cp target/classes com.tlenparty.guessgame.MainApp number   # guess the number
```

Without Maven: `javac -d out src/main/java/com/tlenparty/guessgame/MainApp.java`.
