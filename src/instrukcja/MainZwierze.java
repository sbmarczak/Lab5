package instrukcja;

class Zwierze {
    // Implementacja klasy Zwierze
}
class Pies extends Zwierze {
    // Implementacja klasy Pies
}
class Kot extends Zwierze {
    // Implementacja klasy Kot
}
public class MainZwierze {
    public static void main(String[] args) {
        Zwierze zwierze = new Pies();
        // Sprawdzenie, czy obiekt jest instancją klasy Pies
        if (zwierze instanceof Pies) {
            System.out.println("To jest pies!");
        } else {
            System.out.println("To nie jest pies.");
        }
        // Sprawdzenie, czy obiekt jest instancją klasy Kot
        if (zwierze instanceof Kot) {
            System.out.println("To jest kot!"); // Ten blok nie zostanie wykonany
        } else {
            System.out.println("To nie jest kot.");
        }
    }
}

