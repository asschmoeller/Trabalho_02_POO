public class TipoGasto {

    private String nome;
    private String categoria;

    public TipoGasto(String nome, String categoria){
        this.nome = nome;
        this.categoria = categoria;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        categoria = categoria;
    }
}