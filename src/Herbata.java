public abstract class Herbata{
    protected String smak, color;
    protected int cenaDetaliczna;
    protected int cenaHurtowna;
    protected int limit;

    public Herbata(String color, String smak, int cenaDetaliczna, int cenaHurtowna, int limit) { // konstruktor kiedy mamy limit
        this.smak = smak;
        this.color = color;
        this.cenaDetaliczna = cenaDetaliczna;
        this.cenaHurtowna = cenaHurtowna;
        this.limit = limit;
    }

    public  Herbata(String color, String smak, int cenaDetaliczna) {//konstruktor kiedy NIE jest podany limit
        this.smak = smak;
        this.color = color;
        this.cenaDetaliczna = cenaDetaliczna;
        this.limit = 0;
    }

    protected Herbata(String color,String smak) { // konstruktor dla klas dziedziczących
        this.color = color;
        this.smak = smak;
    }

    abstract protected int cenaWKoszyku();

    @Override
    public String toString() {
        return smak;
    }

}
