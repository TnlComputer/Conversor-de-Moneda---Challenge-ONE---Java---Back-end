import java.net.http.*;
import java.net.URI;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMonedas {
    private static final String API_KEY = "3eef75be14b295a222cf66be"; // reemplazar con tu clave real
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("==============================");
            System.out.println("      CONVERSOR DE MONEDAS     ");
            System.out.println("==============================");
            System.out.println("1. Dólar (USD) → Peso Argentino (ARS)");
            System.out.println("2. Peso Argentino (ARS) → Dólar (USD)");
            System.out.println("3. Dólar (USD) =>> Real (BRL)");
            System.out.println("4. Real (BRL) → Dólar (USD)");
            System.out.println("5. Dólar (USD) → Peso Colombiano (COP)");
            System.out.println("6. Peso Colombiano (COP) → Dólar (USD)");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> convertir("USD", "ARS", scanner);
                case 2 -> convertir("ARS", "USD", scanner);
                case 3 -> convertir("USD", "BRL", scanner);
                case 4 -> convertir("BRL", "USD", scanner);
                case 5 -> convertir("USD", "COP", scanner);
                case 6 -> convertir("COP", "USD", scanner);
                case 7 -> System.out.println("¡Gracias por usar el conversor!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

            if (opcion != 7) {
                System.out.println("\nPresione ENTER para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void convertir(String base, String destino, Scanner scanner) {
        try {
            System.out.print("Ingrese el monto en " + base + ": ");
            double monto = scanner.nextDouble();

            String direccion = API_URL + base;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

            double tasa = conversionRates.get(destino).getAsDouble();
            double resultado = monto * tasa;

            System.out.printf("%.2f %s = %.2f %s\n", monto, base, resultado, destino);
            System.out.printf("Tasa actual: 1 %s = %.4f %s\n", base, tasa, destino);

        } catch (Exception e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}
