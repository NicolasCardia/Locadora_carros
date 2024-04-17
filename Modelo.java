public class Modelo {
    private String descricaoModelo;
    
    // Atributos das Associacoes
    private Marca marca;

    public Modelo(String descricaoModelo) {
        this.descricaoModelo = descricaoModelo;
    }
    
    public String consultarModelo(){
        return this.toString();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "Modelo{" + "descricaoModelo=" + descricaoModelo + '}';
    }    
}
