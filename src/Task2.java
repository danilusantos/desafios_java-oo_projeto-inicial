import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("Descubra um número entre 0 e 100");
        System.out.println("        ");
        System.out.println("VOCÊ POSSUI 5 TENTATIVAS");
        System.out.println("        ");

        //VARIÁVEIS E OBJETOS
        //Utilize o Scanner para obter os dados do usuário;
        Scanner sc = new Scanner(System.in);
        //Para gerar um número aleatório em Java: new Random().nextInt(100);
        int numeroSorteado = new Random().nextInt(100);
        //Utilize uma variável para contar as tentativas;
        int tentativas = 5;

        //INICIO
        //Utilize um loop para controlar as tentativas;
        while (tentativas > 0) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            if (num == numeroSorteado) {
                //Utilize a instrução break; para interromper o loop.
                break;
            } else {
                System.out.println("    ");
                if (num > numeroSorteado) {
                    System.out.println("O número sorteado é menor");
                } else {
                    System.out.println("O número sorteado é maior");
                }
                tentativas--;
            }
        }

        if (tentativas == 0) {
            System.out.println("Que pena! Você não adivinhou o número " + numeroSorteado);
        } else {
            System.out.println("Parabéns! Você adivinhou o número " + numeroSorteado);
        }
    }
}
