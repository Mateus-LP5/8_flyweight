import java.util.HashMap;
import java.util.Map;

public class CargaFactory {

    private static Map<String, Carga> cargas = new HashMap<>();

    public static Carga getCarga(String nome, boolean isInflamavel) {
        Carga carga = cargas.get(nome);
        if (carga == null) {
            carga = new Carga(nome, isInflamavel);
            cargas.put(nome, carga);
        }
        return carga;
    }

    public static int getTotalCargas() {
        return cargas.size();
    }
}
