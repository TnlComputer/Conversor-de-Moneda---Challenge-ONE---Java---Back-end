import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMonedas {

    private static final String API_KEY = "3eef75be14b295a222cf66be";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n==============================");
            System.out.println("     CONVERSOR DE MONEDAS     ");
            System.out.println("==============================");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda(sc);
                    break;
                case 2:
                    continuar = false;
                    System.out.println("Saliendo del conversor... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void convertirMoneda(Scanner sc) {
        try {
            System.out.print("\nIngrese la moneda base (por ejemplo USD, EUR, ARS): ");
            String monedaBase = sc.next().toUpperCase();

            System.out.print("Ingrese la moneda destino (por ejemplo EUR, BRL, CLP): ");
            String monedaDestino = sc.next().toUpperCase();

            System.out.print("Ingrese el monto a convertir: ");
            double monto = sc.nextDouble();

            // Construir URL dinámica según moneda base
            String url = BASE_URL + monedaBase;

            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Enviar request y obtener respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear JSON
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            // Validar si hubo error (por ejemplo, código inválido)
            if (!json.get("result").getAsString().equals("success")) {
                System.out.println("Error: código de moneda base no válido.");
                return;
            }

            JsonObject rates = json.getAsJsonObject("conversion_rates");

            if (!rates.has(monedaDestino)) {
                System.out.println("Error: moneda destino no válida.");
                return;
            }

            double tasa = rates.get(monedaDestino).getAsDouble();
            double convertido = monto * tasa;

            System.out.printf("\n%.2f %s = %.2f %s%n", monto, monedaBase, convertido, monedaDestino);
            System.out.printf("Tasa: 1 %s = %.4f %s%n", monedaBase, tasa, monedaDestino);

        } catch (Exception e) {
            System.out.println("Ocurrió un error al convertir: " + e.getMessage());
        }
    }
}
