public class English implements IPhrases {
    @Override
    public String getPhrase(int id) {
        String phrase = "";
        switch(id){
            case 1: phrase = "Welcome to Marios Pizzabar"; break;
            case 2: phrase = "1. Show menu"; break;
            case 3: phrase = "2. Create new order"; break;
            case 4: phrase = "3. Show orders"; break;
            case 5: phrase = "4. Change language"; break;
            case 6: phrase = "5. Quit"; break;
            case 7: phrase = "Enter 1 for Danish or 2 for English"; break;
            case 8: phrase = "The language has now changed to: "; break;
            case 9: phrase = "You need to enter a number, dude "; break;
            case 10: phrase = "Enter your choice: "; break;
            default: phrase = "Phrase with id = " + id + " does not exist!";
        }
        return phrase;
    }

    @Override
    public String getLanguage() {
        return "English";
    }
}
