import java.util.Collections;
import java.util.List;

public class Cennik {
    private static Cennik instance = null;
    private List<Herbata> lista;

    private Cennik() {
        lista = Collections.emptyList();
    }
    public static Cennik getInstance() {
        if (instance == null) {
            instance = new Cennik();
        }
        return instance;
    }

    public static Cennik pobierzCennik(){
        return instance;
    }
    public void dodaj(String color, String smak, int cenaDetaliczna, int cenaHurtowna, int limit){
        lista.add(new Herbata(color,smak,cenaDetaliczna,cenaHurtowna,limit){
            @Override
            protected int cenaWKoszyku() {
                return 0;
            }
        });
    }
    public void dodaj(String color, String smak, int cenaDetaliczna){
        lista.add(new Herbata(color,smak,cenaDetaliczna){
            @Override
            protected int cenaWKoszyku() {
                return 0;
            }
        });
    }

}
