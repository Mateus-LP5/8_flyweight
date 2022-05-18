import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTransporteTest {

    @Test
    void deveRetornarCaminhoes() {
        ServicoTransporte servico = new ServicoTransporte();
        servico.cadastrarServico("Scannia", "Gasolina", true);
        servico.cadastrarServico("Volvo", "Gasolina", true);
        servico.cadastrarServico("Mercedes", "Gasolina", true);
        servico.cadastrarServico("Iveco", "Soja", false);

        List<String> saida = Arrays.asList (
        "Veiculo{nome='Scannia', carga='Gasolina', inflamavel='true'}",
        "Veiculo{nome='Volvo', carga='Gasolina', inflamavel='true'}",
        "Veiculo{nome='Mercedes', carga='Gasolina', inflamavel='true'}",
        "Veiculo{nome='Iveco', carga='Soja', inflamavel='false'}");

        assertEquals(saida, servico.obterCaminhoes());
    }

    @Test
    void deveRetornarTotalCargas() {
        ServicoTransporte servico = new ServicoTransporte();
        servico.cadastrarServico("Scannia", "Gasolina", true);
        servico.cadastrarServico("Volvo", "Gasolina", true);
        servico.cadastrarServico("Mercedes", "Gasolina", true);
        servico.cadastrarServico("Iveco", "Soja", false);

        assertEquals(2, CargaFactory.getTotalCargas());
    }
}