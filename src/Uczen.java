import java.util.ArrayList; // Import klasy ArrayList do pracy z listami dynamicznymi

// Definicja klasy Uczen
public class Uczen {
    // Prywatne pola klasy
    private String imie; // Imię ucznia
    private String nazwisko; // Nazwisko ucznia
    private ArrayList<Integer> oceny; // Lista ocen ucznia

    // Konstruktor klasy Uczen
    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();  // Inicjalizuje pustą listę ocen
    }

    // Gettery - metody dostępowe do prywatnych pól klasy
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Integer> getOceny() {
        return new ArrayList<>(oceny);
    }

    // Settery - metody umożliwiające zmianę wartości prywatnych pól klasy
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    // Metoda do dodawania ocen do listy ocen ucznia
    public void dodajOcene(int ocena) {
        oceny.add(ocena);
    }

    // Metoda do obliczania średniej ocen ucznia
    public double obliczSrednia() {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma / (double) oceny.size();
    }

    // Metoda do uzyskania informacji o uczniu
    public String informacje() {
        return "Imię: " + imie + ", Nazwisko: " + nazwisko + ", Średnia ocen: " + obliczSrednia();
    }

    // Główna metoda main programu
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Uczen
        Uczen uczen = new Uczen("Marcin", "Nowakowski");

        // Dodawanie ocen do listy ocen ucznia
        uczen.dodajOcene(2);
        uczen.dodajOcene(3);
        uczen.dodajOcene(4);

        // Wyświetlanie informacji o uczniu
        System.out.println(uczen.informacje());
    }
}
