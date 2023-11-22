
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
public class UserInterface {

    private TodoList todos;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                todos.print();
            } else if (command.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.println("To add: ");
        String addedString = scanner.nextLine();
        this.todos.add(addedString);
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        todos.remove(number);

    }
}
