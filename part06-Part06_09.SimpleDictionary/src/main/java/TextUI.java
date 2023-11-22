
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionaries;

    public TextUI(Scanner scanner, SimpleDictionary dictionaries) {
        this.scanner = scanner;
        this.dictionaries = dictionaries;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            processCommand(word);

        }

    }

    public void processCommand(String word) {
        if (word.equals("add")) {
            add();
        } else if (word.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionaries.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();

        if (this.dictionaries.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionaries.translate(word));
        }
    }
}
