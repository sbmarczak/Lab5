package instrukcja;

public class Osoba {
    private String imie;

    public void setImie(String noweImie) {
        this.imie = noweImie;
    }

    public String getImie() {
        return imie;
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Osoba
        Osoba osoba = new Osoba();

        // Ustawienie imienia za pomocą settera
        osoba.setImie("Pawel");

        // Pobranie imienia za pomocą gettera i wyświetlenie
        System.out.println("Imię osoby: " + osoba.getImie());
    }
}

