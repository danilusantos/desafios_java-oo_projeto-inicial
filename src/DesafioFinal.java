import java.util.Scanner;

public class DesafioFinal {
    public double saldo;

    public DesafioFinal(double saldo) {
        this.saldo = saldo;
    }

    public void mensagemInicial() {
        System.out.println("********************************************");
        System.out.println("Nome:           Danilo Nascimento dos Santos");
        System.out.println("Tipo Conta:     Corrente");
        System.out.printf("Saldo:          R$ %.2f%n", this.saldo);
        System.out.println("********************************************");
    }

    public void consultarSaldo () {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Seu saldo é: %.2f \n", this.saldo);
    }

    public void receberValor (double valor) {
        this.saldo += valor;
        System.out.println("Valor recebido com sucesso!");
    }

    public void transferirValor (double valor) {
        this.saldo -= valor;
        System.out.println("Valor transferido com sucesso");
    }

    public static void main(String[] args) {
        DesafioFinal main = new DesafioFinal(2500);
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double valor = 0;

        while (opcao != 4) {
            main.mensagemInicial();
            System.out.println("        ");
            System.out.println("Operações");
            System.out.println("        ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            System.out.println("        ");

            switch (opcao) {
                case 1:
                    main.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a receber: ");
                    valor = sc.nextDouble();
                    main.receberValor(valor);
                    main.consultarSaldo();
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    valor = sc.nextDouble();
                    if (main.saldo >= valor) {
                        main.transferirValor(valor);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    main.consultarSaldo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
