public class Automovel {
    private String placaAutomovel;
    private long renavamAutomovel;
    private String chassiAutomovel;
    private String corAutomovel;
    private int numeroPortasAutomovel;
    private int tipoCombustivelAutomovel;
    private long quilometragemAutomovel;
    private double valorLocacaoAutomovel;
    
    // atributos das Associacoes
    private Modelo modelo;

    public Automovel(String placaAutomovel, String cor, int nroportas, int tipo_combustivel, long quilometragemAutomovel, long renavamAutomovel, String chassiAutomovel, double valorLocacaoAutomovel) {
        this.placaAutomovel = placaAutomovel;
        this.corAutomovel = cor;
        this.numeroPortasAutomovel = nroportas;
        this.tipoCombustivelAutomovel = tipo_combustivel;
        this.quilometragemAutomovel = quilometragemAutomovel;
        this.renavamAutomovel = renavamAutomovel;
        this.chassiAutomovel = chassiAutomovel;
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
    }

    public void setquilometragemAutomovel(long quilometragemAutomovel) {
        this.quilometragemAutomovel = quilometragemAutomovel;
    }

    public void setvalorLocacaoAutomovel(double valorLocacaoAutomovel) {
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
    }

    public double getvalorLocacaoAutomovel() {
        return valorLocacaoAutomovel;
    }

    public String consultarAutomovel(){        
        return this.toString();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }       
     
    
    @Override
    public String toString() {
        return "Automovel{" + "placa=" + placaAutomovel + ", cor=" + corAutomovel + ", nroportas=" + numeroPortasAutomovel + ", tipo_combustivel=" + tipoCombustivelAutomovel + ", quilometragemAutomovel=" + quilometragemAutomovel + ", renavam=" + renavamAutomovel + ", chassiAutomovel=" + chassiAutomovel + ", valorLocacaoAutomovel=" + valorLocacaoAutomovel + '}';
    }    
}
