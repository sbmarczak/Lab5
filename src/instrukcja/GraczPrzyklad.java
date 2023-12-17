package instrukcja;

// Klasa reprezentująca postać gracza
class Postać {
    private int położenieX;
    private int położenieY;
    public Postać(int położenieX, int położenieY) {
        this.położenieX = położenieX;
        this.położenieY = położenieY;
    }
    public void porusz(int noweX, int noweY) {
        this.położenieX = noweX;
        this.położenieY = noweY;
        System.out.println("Gracz porusza się na pozycję (" + noweX + ", " + noweY + ")");
    }
}
// Klasa reprezentująca gracza w grze
class Gracz {
    private Postać postać;
    public Gracz(Postać postać) {
        this.postać = postać;
    }
    public void poruszGraczem(int noweX, int noweY) {
        postać.porusz(noweX, noweY);
    }
}
// Klasa reprezentująca planszę gry
class Plansza {
    private int szerokość;
    private int wysokość;
    public Plansza(int szerokość, int wysokość) {
        this.szerokość = szerokość;
        this.wysokość = wysokość;
    }
    public void wyświetlInformacje() {
        System.out.println("Plansza gry o wymiarach " + szerokość + "x" + wysokość);
    }
}
// Klasa reprezentująca samą grę
class Gra {
    private Plansza plansza;
    private Gracz gracz;
    public Gra(Plansza plansza, Gracz gracz) {
        this.plansza = plansza;
        this.gracz = gracz;
    }
    public void rozpocznijGre() {
        plansza.wyświetlInformacje();
        gracz.poruszGraczem(2, 3);
    }
}
public class GraczPrzyklad {
    public static void main(String[] args) {
        // Tworzymy obiekty planszy, postaci i gracza
        Plansza plansza = new Plansza(10, 8);
        Postać postaćGracza = new Postać(1, 1);
        Gracz gracz = new Gracz(postaćGracza);
        // Tworzymy obiekt gry, który zawiera planszę i gracza
        Gra mojaGra = new Gra(plansza, gracz);
        // Rozpoczynamy grę, co skutkuje wyświetleniem informacji o planszy i ruchem gracza
        mojaGra.rozpocznijGre();
    }
}

