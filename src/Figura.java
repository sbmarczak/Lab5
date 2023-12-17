// Klasa bazowa Figura
public class Figura {
    // Prywatne pola klasy
    private String nazwa; // Nazwa figury
    private String kolor; // Kolor figury

    // Konstruktor klasy Figur - tworzy nowy obiekt klasy Figura
    public Figura(String nazwa, String kolor) {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    // Gettery - metody dostępowe do prywatnych pól klasy
    public String getNazwa() {
        return nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Kwadrat
        Kwadrat kwadrat = new Kwadrat("Kwadrat", "Niebieski", 2.0);
        // Wyświetlanie informacji o kwadracie
        System.out.println("Nazwa: " + kwadrat.getNazwa());
        System.out.println("Kolor: " + kwadrat.getKolor());
        System.out.println("Pole kwadratu: " + kwadrat.obliczPole());
        System.out.println("Obwód kwadratu: " + kwadrat.obliczObwod());

        // Tworzenie obiektu klasy Kolo
        Kolo kolo = new Kolo("Koło", "Czerwony", 3.0);
        // Wyświetlanie informacji o kole
        System.out.println("\nNazwa: " + kolo.getNazwa());
        System.out.println("Kolor: " + kolo.getKolor());
        System.out.println("Pole koła: " + kolo.obliczPole());
        System.out.println("Obwód koła: " + kolo.obliczObwod());
    }
}

// Klasa Kwadrat dziedzicząca po klasie Figura
class Kwadrat extends Figura {
    private double bok; // Długość boku kwadratu

    // Konstruktor klasy Kwadra - tworzy nowy obiekt klasy Kwadrat
    public Kwadrat(String nazwa, String kolor, double bok) {
        super(nazwa, kolor); // Wywołanie konstruktora klasy bazowej
        this.bok = bok;
    }

    // Metoda do obliczania pola kwadratu
    public double obliczPole() {
        return bok * bok;
    }

    // Metoda do obliczania obwodu kwadratu
    public double obliczObwod() {
        return 4 * bok;
    }
}

// Klasa Kolo dziedzicząca po klasie Figura
class Kolo extends Figura {
    private double promien; // Promień koła

    // Konstruktor klasy Kolo - tworzy nowy obiekt klasy Kolo
    public Kolo(String nazwa, String kolor, double promien) {
        super(nazwa, kolor); // Wywołanie konstruktora klasy bazowej
        this.promien = promien;
    }

    // Metoda do obliczania pola koła
    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    // Metoda do obliczania obwodu koła
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
