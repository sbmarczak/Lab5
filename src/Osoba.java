public class Osoba {
    private String imie; // Imię osoby
    private String nazwisko; // Nazwisko osoby
    private int wiek; // Wiek osoby

    // Gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    // Settery
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba
        Osoba osoba = new Osoba();

        // Ustawianie wartości za pomocą setterów
        osoba.setImie("Marcin");
        osoba.setNazwisko("Nowakowski");
        osoba.setWiek(20);

        // Wyświetlanie wartości za pomocą getterów
        System.out.println("Imię: " + osoba.getImie());
        System.out.println("Nazwisko: " + osoba.getNazwisko());
        System.out.println("Wiek: " + osoba.getWiek());
    }
}
