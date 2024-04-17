import java.sql.Time;
import java.sql.Date;

public class Locacao {
    private Date dataLocacao;
    private Time horaLocacao;
    private Date dataDevolucao;
    private Time horaDevolucao;
    private long quilometragemLocacao;
    private double valorCaucao;
    private double valorLocado;
    private int locacaoDevolvida;

    public Locacao(Date dataLocacao, Time horaLocacao, long quilometragemLocacao, double valorCaucao) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.valorCaucao = valorCaucao;
    }

    public void setdataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void sethoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public void setvalorLocado(double valorLocado) {
        this.valorLocado = valorLocado;
    }

    public void setlocacaoDevolvida(int locacaoDevolvida) {
        this.locacaoDevolvida = locacaoDevolvida;
    }

    public int registrarLocacao(){
        //registrarLocacao registro = new Locacao(dataLocacao, horaLocacao, quilometragemLocacao, valorCaucao)
        return 1;
    }
    
    @Override
    public String toString() {
        return "Locacao{" + "dataLocacao=" + dataLocacao + ", horaLocacao=" + horaLocacao + ", dataDevolucao=" + dataDevolucao + ", horaDevolucao=" + horaDevolucao + ", quilometragemLocacao=" + quilometragemLocacao + ", valorCaucao=" + valorCaucao + ", valorLocado=" + valorLocado + ", locacaoDevolvida=" + locacaoDevolvida + '}';
    }    
}
