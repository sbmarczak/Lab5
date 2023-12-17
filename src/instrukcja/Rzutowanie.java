package instrukcja;

// Klasa reprezentująca ogólny typ Figura
class Figura {
    // Implementacja ogólnego typu
}

// Klasa dziedzicząca po Figurze, reprezentująca bardziej szczegółowy typ Kwadrat
class Kwadrat extends Figura {
    // Implementacja bardziej szczegółowego typu
}

// Klasa Przyklad demonstruje użycie 'this' w celu odwołania się do pola obiektu
class Przyklad {
    private int liczba;

    public void ustawLiczbe(int liczba) {
        // Użycie 'this' pomaga uniknąć konfliktu nazw i jednoznacznie wskazuje na pole obiektu.
        this.liczba = liczba;
    }

    public void wyswietlLiczbe() {
        System.out.println("Liczba: " + this.liczba);
    }
}

// Klasa KlasaNadrzedna zawiera pole x i metodę wyswietlX
class KlasaNadrzedna {
    int x = 10;

    void wyswietlX() {
        System.out.println("Wartość x w klasie nadrzędnej: " + x);
    }
}

// Klasa KlasaPodrzedna dziedziczy po KlasaNadrzedna i nadpisuje pole x oraz metodę wyswietlX
class KlasaPodrzedna extends KlasaNadrzedna {
    int x = 20;

    void wyswietlX() {
        System.out.println("Wartość x w klasie podrzędnej: " + x);
        System.out.println("Wartość x w klasie nadrzędnej (super.x): " + super.x);
    }
}

public class Rzutowanie {
    public static void main(String[] args) {
        // Rzutowanie w górę - Tworzenie obiektu Kwadrat i przypisanie do referencji Figura
        Figura figura = new Kwadrat();

        // Rzutowanie w dół z użyciem instanceof
        if (figura instanceof Kwadrat) {
            // Rzutowanie figury do typu Kwadrat
            Kwadrat kwadrat = (Kwadrat) figura; // Rzutowanie w dół
            // Możemy teraz używać metod specyficznych dla Kwadratu
        }

        // Użycie klasy Przyklad do demonstracji 'this'
        Przyklad przyklad = new Przyklad();
        przyklad.ustawLiczbe(10);
        przyklad.wyswietlLiczbe();

        // Użycie klas KlasaNadrzedna i KlasaPodrzedna do pokazania mechanizmu nadpisywania pól i metod
        KlasaPodrzedna klasaPodrzedna = new KlasaPodrzedna();
        klasaPodrzedna.wyswietlX();
    }
}
