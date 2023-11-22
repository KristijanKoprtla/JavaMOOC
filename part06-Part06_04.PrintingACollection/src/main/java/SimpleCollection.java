
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name + " has " + this.elements.size();

        String elementName = "";
        for (int i = 0; i < elements.size(); i++) {
            if(i == 0){
                elementName += elements.get(i);
            } else if(i > 0 && i < elements.size()) {
                elementName = elementName + "\n" + elements.get(i);
            }
        }

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1) {
            return printOutput + " element:\n" + elementName;
        } else {
            return printOutput + " elements:\n" + elementName;
        }
    }

}
