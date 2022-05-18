public class Caminhao {

    private String nome;
    private Carga carga;

    public Caminhao (String nome, Carga carga) {
        this.nome = nome;
        this.carga = carga;
    }

    public String getInfoTransporte () {
        return "Veiculo{" +
                "nome='" + this.nome + '\'' +
                ", carga='" + carga.getNome() + '\'' +
                ", inflamavel='" + carga.isInflamavel() + '\'' +
                '}';
    }
}
