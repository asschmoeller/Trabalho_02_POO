import java.util.Date;

public class Ganho {

    private Date data;
    private double valor;
    private TipoGanho tipoganho;

    public Ganho(Date data, double valor, TipoGanho tipoganho) {
        this.data = data;
        this.valor = valor;
        this.tipoganho = tipoganho;
    }

    public Date getData() {

        return data;
    }

    public void setData(Date data) {

        this.data = data;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public TipoGanho getTipoganho() {

        return tipoganho;
    }

    public void setTipogasto(TipoGanho tipoganho) {
        this.tipoganho = tipoganho;
    }
}