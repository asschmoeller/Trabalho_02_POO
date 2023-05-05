import java.util.ArrayList;
import java.util.List;

public class Gestao {

    private List<Gasto> gasto;
    private List<Ganho> ganho;

    public Gestao(){
        this.gasto = new ArrayList();
        this.ganho = new ArrayList();
    }
    
    public void InserirGasto(Gasto valor){
        gasto.add(valor);
    }
    
    public void InserirGanho(Ganho valor){
        ganho.add(valor);
    }
    
    public double TotalValoresGasto(){
        double total = 0.0;
        for (Gasto gasto: gasto){
            total += gasto.getValor();
        }
        return total;
    }

    public double RelatorioSaldo(){
        return TotalValoresGanho() - TotalValoresGasto();
    }
        
    public double TotalValoresGanho(){
        double total = 0.0;
        for (Ganho ganho: ganho){
            total += ganho.getValor();
        }
        return total;
    }
    
    public List<Gasto> getGasto() {

        return gasto;
    }

    public List<Ganho> getGanho() {

        return ganho;
    }
    public List<Ganho> getGanhoMes(int ano, int mes){
        List<Ganho> ganhomes = new ArrayList<>();
        for(Ganho valor: ganho){
            if(valor.getData().getYear() == ano && valor.getData().getMonth() == mes){
                ganhomes.add(valor);
            }
        };
        return  ganhomes;
    };
    public List<Gasto> getGastoMes(int ano, int mes){
        List<Gasto> gastomes = new ArrayList<>();
        for(Gasto valor: gasto){
            if(valor.getData().getYear() == ano && valor.getData().getMonth() == mes){
                gastomes.add(valor);
            }
        };
        return  gastomes;
    };

    public double getValorGanhoMes(int ano, int mes){
        double res = 0;
        for(Ganho valor: ganho){
            if(valor.getData().getYear() == ano && valor.getData().getMonth() == mes){
                res += valor.getValor();
            }
        };
        return  res;
    }
    public double getValorGanhoAno(int ano){
        double res = 0;
        for(Ganho valor: ganho){
            if(valor.getData().getYear() == ano){
                res += valor.getValor();
            }
        };
        return  res;
    }

    public double getValorGastoMes(int ano, int mes){
        double res = 0;
        for(Gasto valor: gasto){
            if(valor.getData().getYear() == ano && valor.getData().getMonth() == mes){
                res += valor.getValor();
            }
        };
        return  res;
    }
    public double getValorGastoAno(int ano){
        double res = 0;
        for(Gasto valor: gasto){
            if(valor.getData().getYear() == ano){
                res += valor.getValor();
            }
        };
        return  res;
    }
}