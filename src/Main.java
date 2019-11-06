import java.util.Scanner;

public class Main {

    public static IPhrases phrases = new Danish();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 5){
            showPhrase(true, 1);
            showPhrase(true, 2);
            showPhrase(true, 3);
            showPhrase(true, 4);
            showPhrase(true, 5);
            showPhrase(true, 6);
            showPhrase(false, 10);
            choice = getIntegerFromInput();
            switch(choice){
                case 1: break; // Vis menukort
                case 2: break; // Opret ordre
                case 3: break; // Vis ordrer
                case 4: changeLanguage(); break; // Skift sprog
                case 5: break; // Afslut
            }
        }
    }

    private static void changeLanguage() {
        showPhrase(false,7);
        int choice = getIntegerFromInput();
        switch (choice){
            case 1: phrases = new Danish();break;
            case 2: phrases = new English();break;
        }
        showPhrase(false, 8);
        System.out.println(phrases.getLanguage());
    }

    private static void showPhrase(boolean newLine, int id){
        if (newLine){
            System.out.println(phrases.getPhrase(id));
        } else {
            System.out.print(phrases.getPhrase(id));
        }
    }

    private static int getIntegerFromInput(){
        int inputValue = 0;
        boolean correctInput = false;
        while (!correctInput) {
            try {
                inputValue = Integer.parseInt(input.nextLine());
                correctInput = true;
            } catch (NumberFormatException e) {
                showPhrase(true, 9);
                correctInput = false;
            }
        }
        return inputValue;
    }
}
