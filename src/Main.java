import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "Kevin Costa";
        String tipoDaConta = "Corrente";
        double saldo = 1200;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoDaConta);
        System.out.println("Saldo inicial: " + "R$" + saldo);
        System.out.println("******************************");

        String menu = """
                ** Digite sua opção **
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();

            if (opcao == 1) {
                    System.out.println("O saldo atual é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                double deposito = entrada.nextDouble();
                saldo += deposito;
                System.out.println("Saldo atualizado R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir");
                double saque = entrada.nextDouble();
                if (saque < saldo) {
                    saldo -= saque;
                    System.out.println("Saldo atualizado R$" + saldo);
                } else {
                    System.out.println("Você não tem saldo suficiente");
                }
            } else if (opcao == 4) {
                System.out.println("Programa encerrado");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }

        entrada.close();
    }
}