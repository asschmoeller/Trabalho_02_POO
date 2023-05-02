import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    
        Gestao financeiro = new Gestao();
        
        Ganho ganhoA = new Ganho(new Date(2022,02,05), 1000, new TipoGanho("Trabalho", "Empresa"));
        Ganho ganhoB = new Ganho(new Date(2022,02,05), 1000, new TipoGanho("Extra", "Empresa"));
        Ganho ganhoC = new Ganho(new Date(2022,01,05), 1000, new TipoGanho("Trabalho_finds", "Freelancer"));
        Gasto gastoA = new Gasto(new Date(2022,02,05), 500, new TipoGasto("Mercado A", "Alimentação"), new FormadePagamento("Boleto"));
        Gasto gastoB = new Gasto(new Date(2022,02,05), 500, new TipoGasto("Gasolina", "Carro"), new FormadePagamento("Débito"));
        Gasto gastoC = new Gasto(new Date(2022,02,05), 500, new TipoGasto("PresenteA", "Presentes"), new FormadePagamento("Crédito"));
        Gasto gastoD = new Gasto(new Date(2022,02,05), 500, new TipoGasto("Água", "Casa"), new FormadePagamento("Boleto"));
        Gasto gastoE = new Gasto(new Date(2022,02,05), 500, new TipoGasto("Luz", "Casa"), new FormadePagamento("Boleto"));
        Gasto gastoF = new Gasto(new Date(2022,02,05), 100, new TipoGasto("Passeio", "Lazer"), new FormadePagamento("Débito"));
        financeiro.InserirGanho(ganhoA);
        financeiro.InserirGanho(ganhoB);
        financeiro.InserirGanho(ganhoC);
        financeiro.InserirGasto(gastoA);
        financeiro.InserirGasto(gastoB);
        financeiro.InserirGasto(gastoC);
        financeiro.InserirGasto(gastoD);
        financeiro.InserirGasto(gastoE);
        financeiro.InserirGasto(gastoF);
        //Scanner leitor = new Scanner(System.in);
        //financeiro.InserirGasto(gastoA);
        //System.out.println("Digite a data do gasto");
        //leitor.nextLine();
        System.out.println("O total de ganhos foi: " + financeiro.TotalValoresGanho());
        System.out.println("O total de gastos foi: " + financeiro.TotalValoresGasto());
        System.out.println("O total de gastos foi: " + financeiro.RelatorioSaldo());

        System.out.println("O ganho no mês 2: " );
        List<Ganho> listaGanhoMes  = financeiro.getGanhoMes(2022, 02);

        for(Ganho values : listaGanhoMes){
            System.out.println(String.format("Na Data: %s/%s/%s com valor de R$ %.2f do Tipo: %s",values.getData().getDate(),values.getData().getMonth(),values.getData().getYear(), values.getValor(), values.getTipoganho().getNome()));
        }
        System.out.println("O ganho Total do mês 2 foi: " + financeiro.getValorGanhoMes(2022, 02));
        System.out.println("O ganho Total do ano 2022 foi: " + financeiro.getValorGanhoAno(2022));


        System.out.println("O gasto no mês 2:" );
        List<Gasto> listaGastoMes  = financeiro.getGastoMes(2022, 02);

        for(Gasto values : listaGastoMes){
            System.out.println(String.format("Na Data: %s/%s/%s com valor de R$ %.2f do Tipo: %s e no formato: %s",values.getData().getDate(),values.getData().getMonth(),values.getData().getYear(), values.getValor(), values.getTipogasto().getNome(), values.getFormadepagamento().getNome()));
        }
        System.out.println("O gasto Total do mês 2 foi: " + financeiro.getValorGastoMes(2022, 02));
        System.out.println("O gasto Total do ano 2022 foi: " + financeiro.getValorGastoAno(2022));


    }
}

