public class Main {
    public static void main(String[] args) {
        System.out.println("CONVERTENDO TEMPERATURAS DE GRAUS CELSIUS PARA FAHRENHEIT");
        System.out.println(" ");

        int celsius = 24;
        double fahreinheit = celsius * 1.8 + 32;

        System.out.println("Convertendo " + celsius + "ºC em: " + (int) fahreinheit + "ºF");

        System.out.println(" ");
        System.out.println("1. MÉDIA DE DUAS NOTAS DECIMAIS");
        System.out.println(" ");

        double n1 = 6;
        double n2 = 8;
        double media = (n1 + n2) / 2;

        String mensagem = String.format("A média entre %.1f e %.1f é: %.2f", n1, n2, media);
        System.out.println(mensagem);

        System.out.println(" ");
        System.out.println("2. CASTING DE DOUBLE PARA INT");
        System.out.println(" ");

        double valor = 3.45;
        int valorConvertido = (int) valor;

        System.out.println("Valor convertido: " + valorConvertido);

        System.out.println(" ");
        System.out.println("3. CONCATENAR MENSAGEM");
        System.out.println(" ");

        char letra = 'A';
        String palavra = " Orfã";

        System.out.println(letra + palavra);

        System.out.println(" ");
        System.out.println("4. CALCULAR PRECO TOTAL");
        System.out.println(" ");

        double precoProduto = 12.99;
        int quantidade = 9;

        double total = precoProduto * quantidade;

        System.out.println(String.format("Total: R$%.2f", total));

        System.out.println(" ");
        System.out.println("5. CONVERSÃO DE DÓLAR PARA REAL");
        System.out.println(" ");

        double valorEmDolares = 10.95;
        double cotacaoDolar = 4.94;

        System.out.println(String.format("O valor de USD%.2f em reais é: BRL%.2f", valorEmDolares, (valorEmDolares * cotacaoDolar)));

        System.out.println(" ");
        System.out.println("6. PREÇO FINAL COM DESCONTO");
        System.out.println(" ");

        double precoOriginal = 299.80;
        double percentualDesconto = 10;

        double precoFinalComDesconto = precoOriginal - (precoOriginal * (percentualDesconto / 100));

        System.out.println(String.format("O preço de %.2f com %s%% de desconto é: %.2f", precoOriginal, percentualDesconto, precoFinalComDesconto));
    }
}