// Klasa Student
public class Student {
    // Prywatne pola klasy
    private String imie; // Imię studenta
    private String nazwisko; // Nazwisko studenta
    private String numerIndeksu; // Numer indeksu studenta

    // Gettery - metody dostępowe do prywatnych pól klasy
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    // Settery - metody umożliwiające zmianę wartości prywatnych pól klasy
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    // Setter dla numerIndeksu sprawdza, czy numer indeksu składa się z dokładnie 8 cyfr
    public void setNumerIndeksu(String numerIndeksu) {
        if (numerIndeksu.matches("\\d{8}")) {
            this.numerIndeksu = numerIndeksu;
        } else {
            System.out.println("Numer indeksu powinien składać się z dokładnie 8 cyfr.");
        }
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Student
        Student student = new Student();

        // Ustawianie wartości za pomocą setterów
        student.setImie("Maciej");
        student.setNazwisko("Nowakowski");
        student.setNumerIndeksu("87654321");

        // Wyświetlanie wartości za pomocą getterów
        System.out.println("Imię: " + student.getImie());
        System.out.println("Nazwisko: " + student.getNazwisko());
        System.out.println("Numer indeksu: " + student.getNumerIndeksu());
    }
}
