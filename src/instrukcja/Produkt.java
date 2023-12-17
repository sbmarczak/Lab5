package instrukcja;

public class Produkt {
    private String nazwa;
    private double cena;
    // Dodaj gettery i settery dla nazwy
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    // Dodaj gettery i settery dla ceny
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        if (cena >= 0) {
            this.cena = cena;
        } else {
            System.out.println("Cena nie może być ujemna.");
        }
    }
}
// Przykład użycia
class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt();

        // Ustawienie nazwy za pomocą settera
        produkt.setNazwa("Laptop");

        // Ustawienie ceny za pomocą settera
        produkt.setCena(2500.0);

        // Pobranie nazwy za pomocą gettera i wyświetlenie
        System.out.println("Nazwa produktu: " + produkt.getNazwa());

        // Pobranie ceny za pomocą gettera i wyświetlenie
        System.out.println("Cena produktu: " + produkt.getCena());
    }
}

