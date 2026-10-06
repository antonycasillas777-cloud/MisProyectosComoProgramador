package ProyectosCrecimientoProgramador;

import java.util.Random;
import java.util.Scanner;

public class FichaJugador {
    public static void main(String[] args) {
        
        //Creamos los objetos Scanner y Random
        var sc = new Scanner(System.in);
        var random = new Random();
        
        //Creamos de la constante para el titulo
        final var TITULO_PROGRAMA = "===== JAVA PLAY =====";
        
        //Pedir los datos al usuario
        System.out.print("Ingresa tu nombre: ");
        var nombreJugador = sc.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellidoJugador = sc.nextLine();
        System.out.print("Ingresa tu video juego fav: ");
        var juegoFavorito = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa las horas jugadas: ");
        var horasJugadas = Double.parseDouble(sc.nextLine());
        System.out.print("Tienes una suscripcion (true/false)?: ");
        var tieneSuscripcion = Boolean.parseBoolean(sc.nextLine());
        
        //Normalizar los datos 
        String nombreCompleto = nombreJugador.strip().toUpperCase() + " " + apellidoJugador.strip().toUpperCase();
        
        //Generar el numero aleatorio entre 100 y 999
        var numeroAleatorio = random.nextInt(100, 1000);
        
        //Concatenar el Alias del jugador
        String aliasJugador = nombreJugador.strip().substring(0, 2).toLowerCase()
                + apellidoJugador.strip().toLowerCase() + numeroAleatorio;
        
        //Codigo de jugador
        apellidoJugador = apellidoJugador.strip();
        String codigoJugador = nombreJugador.strip().substring(0, 1).toUpperCase() + 
                apellidoJugador.substring(apellidoJugador.length()-1).toUpperCase() 
                + numeroAleatorio;
        
        //Mas requeriminetos de impresion
        juegoFavorito = juegoFavorito.toUpperCase();
        
        //Generar la Ficha de jugador(Impresion)
        System.out.println("");
        System.out.println(TITULO_PROGRAMA);
        System.out.printf("""
                          Cd: %s
                          Jugador: %s
                          Alias: %s
                          Edad: %d
                          Video juego fav: %s
                          Horas jugadas: %.1f
                          Suscripcion?: %b
                          """, codigoJugador, nombreCompleto, aliasJugador, edad, 
                          juegoFavorito, horasJugadas, tieneSuscripcion);
        
    }
    
}
