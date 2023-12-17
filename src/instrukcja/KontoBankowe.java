package instrukcja;

public class KontoBankowe {
    // Prywatne pole, dostępne tylko wewnątrz klasy KontoBankowe
    private double saldo;

    // Publiczny getter do uzyskiwania wartości salda
    public double getSaldo() {
        return saldo;
    }

    // Publiczna metoda do wpłacania środków, zmieniająca saldo w kontrolowany sposób
    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
        }
    }

    // Publiczna metoda do wypłacania środków, zmieniająca saldo w kontrolowany sposób
    public void wyplac(double kwota) {
        if (kwota > 0 && kwota <= saldo) {
            saldo -= kwota;
        }
    }

    /** DODANA funkcja main */
    public static void main(String[] args) {
        // Tworzenie nowego konta bankowego
        KontoBankowe konto = new KontoBankowe();

        // Wpłacanie 5000 na konto
        konto.wplac(5000);

        // Wyświetlanie salda po wpłacie
        System.out.println("Saldo po wpłacie: " + konto.getSaldo());

        // Wypłacanie 1000 z konta
        konto.wyplac(1000);

        // Wyświetlanie salda po wypłacie
        System.out.println("Saldo po wypłacie: " + konto.getSaldo()); // 4000 zł
    }
}

