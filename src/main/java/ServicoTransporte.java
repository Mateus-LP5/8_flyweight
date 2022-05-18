import java.util.ArrayList;
import java.util.List;

public class ServicoTransporte {

    private List<Caminhao> servicosTransporte = new ArrayList<>();

    public void cadastrarServico (String nomeCaminhao, String nomeCarga, boolean isInflamavel) {
        Carga carga = CargaFactory.getCarga(nomeCarga, isInflamavel);
        Caminhao caminhao = new Caminhao(nomeCaminhao, carga);
        servicosTransporte.add(caminhao);
    }

    public List<String> obterCaminhoes() {
        List<String> saida = new ArrayList<String>();
        for (Caminhao caminhao : this.servicosTransporte){
            saida.add(caminhao.getInfoTransporte());
        }
        return saida;
    }
}