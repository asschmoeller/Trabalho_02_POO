import java.util.Date;

public class Gasto {

    private Date data;
    private double valor;
    private TipoGasto tipogasto;
    private FormadePagamento formadepagamento;

    public Gasto(Date data, double valor, TipoGasto tipogasto, FormadePagamento formadepagamento) {
        this.data = data;
        this.valor = valor;
        this.tipogasto = tipogasto;
        this.formadepagamento = formadepagamento;
    }

    public Gasto(Date data, double valor){
        setData(data);
        setValor(valor);
    }

    public TipoGasto getTipogasto() {

        return tipogasto;
    }

    public void setTipogasto(TipoGasto tipogasto) {

        this.tipogasto = tipogasto;
    }

    public Date getData(){

        return data;
    }
    public double getValor(){

        return valor;
    }
    public void setData(Date data){

        this.data = data;
    }
    public void setValor(double valor){

        this.valor = valor;
    }

    public FormadePagamento getFormadepagamento() {

        return formadepagamento;
    }

    public void setFormadePagamento(FormadePagamento formadepagamento) {

        this.formadepagamento = formadepagamento;
    }

}