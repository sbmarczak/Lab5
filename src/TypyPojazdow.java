// Klasa bazowa Pojazd
class Pojazd {
    private String marka; // Prywatne pole przechowujące markę pojazdu
    private int rokProdukcji; // Prywatne pole przechowujące rok produkcji pojazdu

    // Konstruktor klasy Pojazd
    public Pojazd(String marka, int rokProdukcji) {
        this.marka = marka; // Inicjalizacja marki pojazdu
        this.rokProdukcji = rokProdukcji; // Inicjalizacja roku produkcji pojazdu
    }

    // Gettery
    public String getMarka() { // Getter dla marki
        return marka;
    }

    public int getRokProdukcji() { // Getter dla roku produkcji
        return rokProdukcji;
    }
}

// Klasa Samochod dziedzicząca po klasie Pojazd
class Samochod extends Pojazd {
    private int liczbaDrzwi; // Prywatne pole przechowujące liczbę drzwi samochodu
    private String typSilnika; // Prywatne pole przechowujące typ silnika samochodu

    // Konstruktor klasy Samochod
    public Samochod(String marka, int rokProdukcji, int liczbaDrzwi, String typSilnika) {
        super(marka, rokProdukcji); // Wywołanie konstruktora klasy nadrzędnej (Pojazd)
        this.liczbaDrzwi = liczbaDrzwi; // Inicjalizacja liczby drzwi samochodu
        this.typSilnika = typSilnika; // Inicjalizacja typu silnika samochodu
    }

    // Gettery
    public int getLiczbaDrzwi() { // Getter dla liczby drzwi
        return liczbaDrzwi;
    }

    public String getTypSilnika() { // Getter dla typu silnika
        return typSilnika;
    }
}

// Klasa Motocykl dziedzicząca po klasie Pojazd
class Motocykl extends Pojazd {
    private String typNapedu; // Prywatne pole przechowujące typ napędu motocykla
    private int pojemnoscSilnika; // Prywatne pole przechowujące pojemność silnika motocykla

    // Konstruktor klasy Motocykl
    public Motocykl(String marka, int rokProdukcji, String typNapedu, int pojemnoscSilnika) {
        super(marka, rokProdukcji); // Wywołanie konstruktora klasy nadrzędnej (Pojazd)
        this.typNapedu = typNapedu; // Inicjalizacja typu napędu motocykla
        this.pojemnoscSilnika = pojemnoscSilnika; // Inicjalizacja pojemności silnika motocykla
    }

    // Gettery
    public String getTypNapedu() { // Getter dla typu napędu
        return typNapedu;
    }

    public int getPojemnoscSilnika() { // Getter dla pojemności silnika
        return pojemnoscSilnika;
    }
}

// Klasa TypyPojazdow do testowania klas Pojazd, Samochod i Motocykl
public class TypyPojazdow {
    public static void main(String[] args) {
        // Tworzenie obiektów klasy Samochod i Motocykl
        Samochod samochod = new Samochod("Opel", 2006, 4, "Benzyna"); // Tworzenie obiektu klasy Samochod
        Motocykl motocykl = new Motocykl("Kawasaki", 2010, "Łańcuch", 650); // Tworzenie obiektu klasy Motocykl

        // Rzutowanie obiektów klasy Samochod i Motocykl na Pojazd
        Pojazd pojazd1 = samochod; // Rzutowanie obiektu samochod na typ Pojazd
        Pojazd pojazd2 = motocykl; // Rzutowanie obiektu motocykl na typ Pojazd

        // Wyświetlanie informacji o pojazdach
        System.out.println("Pojazd 1: " + pojazd1.getMarka() + ", " + pojazd1.getRokProdukcji());
        System.out.println("Pojazd 2: " + pojazd2.getMarka() + ", " + pojazd2.getRokProdukcji());
    }
}
