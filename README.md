# Conversor de Monedas en Java
  Esta es una aplicación de consola desarrollada en Java que permite convertir entre diferentes monedas utilizando una tasa de conversion obtenida de la API de https://v6.exchangerate-api.com/v6. 
  Es ideal para poder practicar lógica de programación, manejo de APIs y estructuras de control en Java.

## Características
- Conversión entre diferentes monedas el menú mostrara las diferentes conversiones de moneda:
   Dolar -> Peso argentino.
   Peso argentino -> Dolar.
    .......
- Integración con una API de tipo de cambio en tiempo real.
- Interfaz simple mediante consola.

## Tecnologías utilizadas

- Java.
- JSON.
- Librerías:  `Gson` para parseo JSON si usas una librería externa

## Instalación y ejecución
Clona el repositorio:

```bash
git clone https://github.com/julcavasquez/conversor_moneda.git

## Ejemplo de uso

1.- Seleccione del menú el tipo de conversion que va a realizar:
  si selecciona opcion 1) Dolar =>> Peso argentino

2.- Ingrese el valor que deseas convertir: 100
3.- Resultado:
    "El Valor 100 [ USD ] corresponde al valor final de 116343.83 [ ARS ] .";
4.- La Opción 7 permite mostrar el historial de todas las conversiones realizadas.
