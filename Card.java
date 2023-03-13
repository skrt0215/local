import java.util.Scanner;

public class Card {
    private String cardName;
    private String cardClass;
    private String type;
    //setters - 1 for each, set the variables
    //getters - 1 for each, set the variables
    //constructor - should set all 3 variables
    public Card(String newCardName, String newClass, String newType)
    {
        cardName = newCardName;
        cardClass = newClass;
        type = newType;
    }

    //readinput
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        cardName = keyboard.nextLine();
    }
    //writeoutput
    public void writeOutput()
    {
        System.out.println("Card: "+ cardName);
        System.out.println("Class: "+ cardClass);
        System.out.println("Type: "+ type);
    }
}