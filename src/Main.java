public class Main {
    public static void main(String[] args) {
        System.out.println("CONVERTENDO TEMPERATURAS DE GRAUS CELSIUS PARA FAHRENHEIT");
        System.out.println(" ");

        int celsius = 24;
        double fahreinheit = celsius * 1.8 + 32;

        System.out.println("Convertendo " + celsius + "ºC em: " + (int) fahreinheit + "ºF");
    }
}