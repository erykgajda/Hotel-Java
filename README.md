# Hotel-Java

Bienvenido a **Hotel-Java**, un proyecto simple desarrollado como parte de mi aprendizaje de Java. Este sistema permite a los usuarios realizar reservas de habitaciones en un hotel, interactuando a través de la consola.

## Características del Proyecto

- Solicita al usuario su **nombre** y **apellido**.
- Permite elegir entre tres tipos de habitaciones: **VIP**, **Media**, y **Barata**.
- Calcula el precio correspondiente según el tipo de habitación.
- Genera un ticket único para cada reserva.
- Muestra un resumen de la reserva o permite cancelarla.

## Tecnologías y Conceptos Usados

El proyecto hace uso de los siguientes conceptos de Java:

- **Variables**: Para almacenar información como nombre, apellido, tipo de habitación y precio.
- **Switch**: Para gestionar la selección del tipo de habitación.
- **Scanner**: Para la entrada de datos del usuario.
- **Generación de números aleatorios**: Para crear un identificador único de reserva.

## Ejecución

1. Clona este repositorio en tu máquina local.
2. Abre el archivo `HotelEjemplo.java` en tu IDE favorito o en un editor de texto.
3. Ejecuta el programa para interactuar con el sistema de reservas.

## Ejemplo de Uso

```plaintext
Bienvenido al Hotel de 5 estrellas

Me podrías indicar tu nombre?
Juan

Me podrías indicar tu apellido?
Pérez

Vale Juan, ¿quieres reservar una habitación?
¿Qué tipo de habitación deseas: vip / media / barata?
vip

El precio de la VIP son $100 por noche
¿Desea realizar la compra? si/no:
si

Reserva guardada, gracias por confiar con nosotros, a continuación te diré los datos.
Tu nombre: Juan
Tu apellido: Pérez
Tu habitación: vip
Precio habitación $100
Ticket: #45
¡Hasta luego! Gracias por confiar con nosotros.
