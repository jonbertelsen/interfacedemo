public class Danish implements IPhrases {
    @Override
    public String getPhrase(int id) {
        String phrase = "";
        switch(id){
            case 1: phrase = "Velkommen til Marios Pizzabar"; break;
            case 2: phrase = "1. Vis menukort"; break;
            case 3: phrase = "2. Opret ny ordre"; break;
            case 4: phrase = "3. Vis ordrer"; break;
            case 5: phrase = "4. Skift sprog"; break;
            case 6: phrase = "5. Afslut"; break;
            case 7: phrase = "Tast 1 for dansk eller 2 for engelsk"; break;
            case 8: phrase = "Sproget er nu: "; break;
            case 9: phrase = "Du skal indtaste et tal makker "; break;
            case 10: phrase = "Indtast valg: "; break;
            default: phrase = "Ledetekst med id = " + id + " findes ikke!";
        }
        return phrase;
    }

    @Override
    public String getLanguage() {
        return "Dansk";
    }
}
