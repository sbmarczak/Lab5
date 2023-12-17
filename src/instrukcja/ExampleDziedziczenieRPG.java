package instrukcja;

// Klasa bazowa reprezentująca ogólną postać w grze
class PostaćNowa {
    private String imię;
    private int poziom;
    private int punktyŻycia;
    public PostaćNowa(String imię, int poziom, int punktyŻycia) {
        this.imię = imię;
        this.poziom = poziom;
        this.punktyŻycia = punktyŻycia;
    }
    public void atak() {
        System.out.println("Postać atakuje.");
    }
    public void otrzymajObrażenia(int obrażenia) {
        punktyŻycia -= obrażenia;
        System.out.println("Postać otrzymuje obrażenia. Pozostałe punkty życia: " + punktyŻycia);
    }
}
// Klasa dziedzicząca po klasie PostaćNowa
class Bohater extends PostaćNowa {
    private String umiejętność;
    public Bohater(String imię, int poziom, int punktyŻycia, String umiejętność) {
        // Wywołanie konstruktora klasy nadrzędnej (PostaćNowa)
        super(imię, poziom, punktyŻycia);
        this.umiejętność = umiejętność;
    }
    // Dodatkowa metoda specyficzna dla klasy Bohater
    public void użyjUmiejętności() {
        System.out.println("Bohater używa umiejętności: " + umiejętność);
    }
}
public class ExampleDziedziczenieRPG {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Bohater
        Bohater bohater = new Bohater("Aragorn", 10, 100, "Mieczobranie");
        // Wywołanie metody dziedziczonej po klasie PostaćNowa
        bohater.atak();
        // Wywołanie metody specyficznej dla klasy Bohater
        bohater.użyjUmiejętności();
        // Wywołanie metody dziedziczonej po klasie PostaćNowa
        bohater.otrzymajObrażenia(20);
    }
}
