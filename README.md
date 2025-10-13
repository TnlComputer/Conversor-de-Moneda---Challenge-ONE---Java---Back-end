# 💱 Conversor de Monedas en Java

Este proyecto es un **conversor de monedas interactivo** que utiliza la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actualizadas en tiempo real.

## 🚀 Funcionalidades

- Menú interactivo con opciones de conversión entre diferentes monedas.
- Solicita al usuario el monto a convertir.
- Conexión a la API mediante `HttpClient` de Java.
- Manejo de errores y validaciones de entrada.
- Visualización de la tasa actual del cambio.

## 🧮 Menú de opciones

```
1. Dólar (USD) → Peso Argentino (ARS)
2. Peso Argentino (ARS) → Dólar (USD)
3. Dólar (USD) → Real (BRL)
4. Real (BRL) → Dólar (USD)
5. Dólar (USD) → Peso Colombiano (COP)
6. Peso Colombiano (COP) → Dólar (USD)
7. Salir
```

## 🧠 Ejemplo de uso

```
Ingrese el monto en USD: 100
100.00 USD = 98000.00 ARS
Tasa actual: 1 USD = 980.0000 ARS
```

## ⚙️ Tecnologías utilizadas

- **Java 17+**
- **Gson** (para parsear JSON)
- **HttpClient** (para llamadas a la API)

## 📦 Instalación y ejecución

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/TnlComputer/Conversor-de-Moneda---Challenge-ONE---Java---Back-end.git
   cd conversor-monedas-java
   ```

2. **Agrega la librería Gson** (si usas VSCode o IntelliJ):
   - Descarga el `.jar` desde [https://github.com/google/gson](https://github.com/google/gson)
   - Luego inclúyelo en tu proyecto:
     ```
     File > Project Structure > Libraries > Add > gson-x.x.x.jar
     ```

3. **Configura tu API Key**  
   Obtén una gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/)  
   y reemplaza esta línea en el código:

   ```java
   private static final String API_KEY = "YOUR-API-KEY";
   ```

   Nota: El Código va entre comillas
---

## ▶️ Ejecución

Compila y ejecuta el programa desde la terminal:

```bash
javac ConversorMonedas.java
java ConversorMonedas
```

---

## 💡 Ejemplo de uso

```

## 🧩 Estructura del proyecto

```
📁 conversor-monedas-java/
│
├── ConversorMonedas.java    # Código principal del programa
├── gson-x.x.x.jar           # Librería Gson (si no usas gestor de dependencias)
└── README.md                # Documentación del proyecto
```

---

## ⚠️ Notas importantes

- Requiere **conexión a Internet** para obtener las tasas de cambio.
- Las tasas pueden variar según la actualización de la API.
- En caso de error (por ejemplo, código de moneda no válido), el programa mostrará un mensaje explicativo y volverá al menú principal.

---

## 🔮 Mejoras futuras

- Agregar historial de conversiones en archivo o base de datos.
- Implementar interfaz gráfica (Swing o JavaFX).
- Integrar conversión automática de varias monedas a la vez.
- Mostrar fecha y hora de la última actualización de tasas.

---

## 🧑‍💻 Autor

**Jorge Gustavo Martinez**  
Analista Programador – Especialista en desarrollo backend y herramientas de Business Intelligence.  
📧 Contacto: [sandokan992000@gmail.com]  
🌐 GitHub: [https://www.linkedin.com/in/jorgegustavomartinez/#:~:text=www.linkedin.com/in/jorgegustavomartinez](https://www.linkedin.com/in/jorgegustavomartinez/#:~:text=www.linkedin.com/in/jorgegustavomartinez)

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia **MIT**, lo que permite su uso, modificación y distribución libremente.

## 📅 Fecha de creación
13/10/2025

---

### 🏷️ Insignia del Proyecto

![Java Badge](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-active-success)
