import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        Gestao financeiro = new Gestao();
        while (continuar){
            System.out.println("Bem vindo ao Sistema de Gestão Financeira.");
            System.out.println("Digite 1 para inserir ganhos");
            System.out.println("Digite 2 para inserir gastos");
            System.out.println("Digite 3 para consultar relatório");
            System.out.println("Digite 4 para sair");
            int opcao = leitor.nextInt();
            switch (opcao){
                case 2:
                    // Solicitando ao usuário inserir tipo de gasto:
                    System.out.println("Digite o nome do tipo do gasto");
                    String nomeGasto = leitor.next();

                    System.out.println("Digite a categoria do tipo do gasto");
                    String categoriaGasto = leitor.next();

                    // Criando objeto para saber tipo do gasto:
                    TipoGasto tipoGasto = new TipoGasto(nomeGasto,categoriaGasto);

                    // mesma coisa para pagamento
                    System.out.println("Digite o nome da forma de pagamento");
                    String nomePagamento = leitor.next();

                    FormadePagamento formadePagamento = new FormadePagamento(nomePagamento);

                    // Solicitando ao usuário data do gasto
                    System.out.println("Digite o ano do gasto");
                    int anoGasto = leitor.nextInt();

                    System.out.println("Digite o mês do gasto");
                    int mesGasto = leitor.nextInt();

                    System.out.println("Digite o dia do gasto");
                    int diaGasto = leitor.nextInt();

                    Date dataGasto = new Date(anoGasto, mesGasto, diaGasto);

                    // Solicitando ao usuário o valor do gasto
                    System.out.println("Digite o valor do gasto");
                    double valorGasto = leitor.nextDouble();

                    financeiro.InserirGasto(new Gasto(dataGasto, valorGasto, tipoGasto, formadePagamento));

                    break;
                case 1:
                    // Solicitando ao usuário inserir tipo de ganho:
                    System.out.println("Digite o nome do tipo do ganho");
                    String nomeGanho = leitor.next();

                    System.out.println("Digite a categoria do tipo do ganho");
                    String categoriaGanho = leitor.next();

                    // Criando objeto para saber tipo do ganho:
                    TipoGanho tipoGanho = new TipoGanho(nomeGanho,categoriaGanho);

                    // Solicitando ao usuário data do ganho:
                    System.out.println("Digite o ano do ganho");
                    int anoGanho = leitor.nextInt();

                    System.out.println("Digite o mês do ganho");
                    int mesGanho = leitor.nextInt();

                    System.out.println("Digite o dia do ganho");
                    int diaGanho = leitor.nextInt();

                    Date dataGanho = new Date(anoGanho, mesGanho, diaGanho);

                    // Solicitando ao usuário o valor do ganho:
                    System.out.println("Digite o valor do ganho");
                    double valorGanho = leitor.nextDouble();

                    financeiro.InserirGanho(new Ganho(dataGanho, valorGanho, tipoGanho));

                    break;
                case 3:
                    System.out.println("Seus gastos são:");
                    List<Gasto> listaDeGasto = new ArrayList<>();

                    listaDeGasto = (financeiro.getGasto());

                    for (Gasto valorG: listaDeGasto) {
                        System.out.printf("Valor do Gasto %f, Data do Gasto %s, Nome do Tipo do Gasto %s, Forma de Pagamento %s %n", valorG.getValor(), valorG.getData(), valorG.getTipogasto().getNome(), valorG.getFormadepagamento().getNome());
                    }

                    System.out.println("Seus ganhos são:");

                    List<Ganho> listaDeGanho = new ArrayList<>();

                    listaDeGanho = (financeiro.getGanho());

                    for (Ganho valorGG: listaDeGanho) {
                        System.out.printf("Valor do Ganho %f, Data do Ganho %s, Nome do Tipo do Ganho %s %n", valorGG.getValor(), valorGG.getData(), valorGG.getTipoganho().getNome());
                    }

                    System.out.println("O saldo foi de: " + financeiro.RelatorioSaldo());

                    // Solicitando ao usuário inserir o mês do ganho:
                    System.out.println("Digite o mês do ganho");
                    int listmesGanho = leitor.nextInt();

                    // Solicitando ao usuário inserir o ano do ganho:
                    System.out.println("Digite o ano do ganho");
                    int listanoGanho = leitor.nextInt();

                    List<Ganho> listaMesGanho = new ArrayList<>();

                    listaMesGanho.addAll(financeiro.getGanhoMes(listanoGanho,listmesGanho));
                    System.out.println("Os ganhos do mês:");

                    for (Ganho valorGG: listaMesGanho) {
                        System.out.printf("Os ganhos do mês %d, do ano %d foram: Valor do Ganho %f, Data do Ganho %s, Nome do Tipo do Ganho %s %n", listmesGanho, listanoGanho, valorGG.getValor(), valorGG.getData(), valorGG.getTipoganho().getNome());
                    }

                    // Solicitando ao usuário inserir o mês do gasto:
                    System.out.println("Digite o mês do gasto");
                    int listmesGasto = leitor.nextInt();

                    // Solicitando ao usuário inserir o ano do gasto:
                    System.out.println("Digite o ano do gasto");
                    int listanoGasto = leitor.nextInt();

                    List<Gasto> listaMesGasto = new ArrayList<>();

                    listaMesGasto = (financeiro.getGastoMes(listanoGasto ,listmesGasto));
                    System.out.println("Os gastos do mês:");

                    for (Gasto valorGG : financeiro.getGastoMes(listanoGasto ,listmesGasto)) {
                        System.out.printf("Os gastos do mês %d, do ano %d foram: Valor do Gasto %f, Data do Gasto %s, Nome do Tipo do Gasto %s %n", listmesGasto, listanoGasto, valorGG.getValor(), valorGG.getData(), valorGG.getTipogasto().getNome());
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default: continuar = false; break;
            }
        }
    }
}

