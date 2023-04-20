public class Czarna extends Herbata{
    private int waga;

    public Czarna(String smak, int waga){
        super(Czarna.getColor(),smak);
        this.waga = waga;
    }

    private static String getColor() {
        return "czarna";
    }
    @Override
    protected int cenaWKoszyku() {
        if(waga >= super.limit){
            return waga * cenaHurtowna;
        }else {
            return waga * cenaDetaliczna;
        }
    }
    @Override
    public String toString() {
        if(waga >= super.limit)
            return super.color + ", smak: " + super.smak + ",ilosc " + waga + " kg, cena" + super.cenaHurtowna;
        return super.color + ", smak: " + super.smak + ",ilosc " + waga + " kg, cena" + super.cenaDetaliczna;

    }

}
