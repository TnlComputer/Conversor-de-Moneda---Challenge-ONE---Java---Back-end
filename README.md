# 💱 Conversor de Monedas en Java

Un **conversor de monedas interactivo en consola**, desarrollado en **Java**, que utiliza la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio actualizadas entre distintas divisas.

---

## 🚀 Características

- Conversión **en tiempo real** entre más de 160 monedas.
- Menú interactivo con opciones para:
  - Convertir de una moneda a otra.
  - Repetir conversiones sin reiniciar el programa.
  - Salir de la aplicación fácilmente.
- Manejo de errores comunes (códigos de moneda inválidos, fallos de red, etc.).
- Compatible con **Java 11+** (usa `HttpClient` nativo).

---

## 🛠️ Tecnologías utilizadas

- **Java 11 o superior**
- **Gson** → para procesar la respuesta JSON.
- **ExchangeRate-API** → fuente de datos para tasas de cambio.

---

## 📦 Instalación

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
==============================
     CONVERSOR DE MONEDAS     
==============================
1. Convertir moneda
2. Salir
Seleccione una opción: 1

Ingrese la moneda base (por ejemplo USD, EUR, ARS): USD
Ingrese la moneda destino (por ejemplo EUR, BRL, CLP): ARS
Ingrese el monto a convertir: 10

10.00 USD = 8955.00 ARS
Tasa: 1 USD = 895.5000 ARS
```

---

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
