public class Zielona extends Herbata{
    private int waga;

    public Zielona(String smak, int waga){
        super(Zielona.getColor(),smak);
        this.waga = waga;
    }

    @Override
    protected int cenaWKoszyku() {
        if(waga >= super.limit){
            return waga * cenaHurtowna;
        }else {
            return waga * cenaDetaliczna;
        }
    }

    private static String getColor() {
        return "zielona";
    }

    @Override
    public String toString() {
        if(waga >= super.limit)
            return super.color + ", smak: " + super.smak + ",ilosc " + waga + " kg, cena" + super.cenaHurtowna;
        return super.color + ", smak: " + super.smak + ",ilosc " + waga + " kg, cena" + super.cenaDetaliczna;

    }
}
