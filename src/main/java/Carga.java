public class Carga {

    private String nome;
    private boolean isInflamavel;

    public Carga (String nome, boolean isInflamavel) {
        this.nome = nome;
        this.isInflamavel = isInflamavel;
    }

    public String getNome() {
        return nome;
    }

    public boolean isInflamavel() {
        return isInflamavel;
    }
}
