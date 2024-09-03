import java.util.Scanner;

public class Practical6_ConstantVowels {
    public static void main(String[] args) {
        char character;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character Whether Character is Vowel or Constant");
        character = sc.next().charAt(0);

        CheckCharacter cc = new CheckCharacter(character);
        if (cc.check()) {
            System.out.println(cc.getCharacter() + " is Vowel");
        } else {
            System.out.println(cc.getCharacter() + " is not Vowel/Constant");

        }
        sc.close();
    }
}

class CheckCharacter {
    private char character;

    CheckCharacter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return this.character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public boolean check() {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

}
