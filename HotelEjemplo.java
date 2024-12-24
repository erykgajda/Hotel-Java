package Ejercicios.else_if.Ejemplos;

import java.util.Scanner;

public class HotelEjemplo {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        char dollar = '$';
        String tipoHabitacion;
        int idTicket = (int) (Math.random() * 101);

        int precio = 0;

        System.out.println("Bienvenido al Hotel de 5 estrellas");
        System.out.println(" ");

        System.out.println("Me podrías indicar tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("Me podrías indicar tu apellido?");
        String apellido = scanner.nextLine();

        System.out.println("Vale "+nombre+" quieres reservar una habitacion?");
        System.out.println("Que tipo de habitacion deseas: vip / media / barata");
        tipoHabitacion = scanner.nextLine();

        switch (tipoHabitacion.toLowerCase()) {
            case "vip":
                precio = 100;
                System.out.println("El precio de la VIP son "+dollar + precio +" por noche");
                break;
            case "media":
                precio = 50;
                System.out.println("El precio de la Media-Clase son "+dollar + precio +" por noche");
                break;
            case "barata":
                precio = 15;
                System.out.println("El precio de la Barata son "+dollar + precio +" por noche");
                break;
            default:
                System.out.println("Tipo de habitación no válido. Por favor, intente de nuevo.");
                scanner.close();
                return;
        }

        System.out.println("¿Desea realizar la compra? si/no: ");
        String respuesta = scanner.nextLine();

        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("Reserva guardada, gracias por confiar con nosotros, a continuación te diré los datos.");
            System.out.println("Tu nombre: " + nombre);
            System.out.println("Tu apellido: " + apellido);
            System.out.println("Tu habitación: " + tipoHabitacion);
            System.out.println("Precio habitacion " + dollar + precio);
            System.out.println("Ticket: #" + idTicket);

            System.out.println("¡Hasta luego! Gracias por confiar con nosotros.");
            scanner.close();
        } else {
            System.out.println("Cerrando soporte, la reserva fue cancelada.");
            scanner.close();
        }
    }
}
