
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");

        String file = scanner.nextLine();

        // create a list to store Recipe objects
        ArrayList<Recipe> recipes = new ArrayList<>();

        //create a scanner for reading the file
        try ( Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                //read recipe name
                String name = fileName.nextLine();
                //read cooking time
                int cookingTime = Integer.parseInt(fileName.nextLine());
                //read ingridients
                ArrayList<String> ingredients = new ArrayList<>();

                //read ingredients until blank line is encountered
                while (fileName.hasNextLine()) {
                    String ingredient = fileName.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                //create Recipe object and add it to the list
                Recipe recipe = new Recipe();
                recipe.setName(name);
                recipe.setCookingTime(cookingTime);
                recipe.setIngredients(ingredients);

                recipes.add(recipe);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        procMessage();
        while (true) {

            System.out.println("Enter a command: ");

            String command = scanner.nextLine();
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxCookingTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchedIngredient = scanner.nextLine();
                System.out.println("\nRecipes:");

                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(searchedIngredient)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("stop")) {

                break;
            }
        }
    }

    private static void procMessage() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

}
