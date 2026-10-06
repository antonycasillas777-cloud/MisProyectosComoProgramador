package ProyectosCrecimientoProgramador;

import java.util.Random;
import java.util.Scanner;

public class CotizadorJugador {
    public static void main(String[] args) {
        
        //Agregar los objetos Scanner y Random
        var sc = new Scanner(System.in);
        var random = new Random();
        //Generar el numero random
        var numeroAleatorio = random.nextInt(100, 1000);
        
        //Declarar las constantes
        final var PRECIO_POR_JUGADOR = 8.50;
        final var CARGO_FIJO_INSCRPCION = 2.0;
        final var TITULO_IMPRESION = "===== COTIZADOR DE TORNEO =====";
        
        //Pedir los datos
        System.out.print("Ingresa el nombre del equipo: ");
        var nombreEquipo = sc.nextLine();
        System.out.print("Ingresa el nombre del capitan: ");
        var nombreCapitan = sc.nextLine();
        System.out.print("Ingresa el apellido del capitan: ");
        var apellidoCapitan = sc.nextLine();
        System.out.print("Ingresa la edad del capitan: ");
        var edadCapitan = Integer.parseInt(sc.nextLine());
        System.out.print("En que video juego estan participando?: ");
        var juegoParticipando = sc.nextLine();
        System.out.print("Ingresa la cantidad de jugadores: ");
        var cantidadJugadores = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa el tu salto disponible: ");
        var saldoEquipo = Double.parseDouble(sc.nextLine());
        //Datos tipo boolean
        System.out.print("Tu equipo tiene membresia (true/false)?: ");
        var tieneMembresia = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tu euipo tiene cupon (true/false)?: ");
        var tieneCupon = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tu equipo esta suspendido (true/false)?: ");
        var estaSuspendido = Boolean.parseBoolean(sc.nextLine());
        
        //Procesos y calculos
        var subtotal = cantidadJugadores * PRECIO_POR_JUGADOR;
        var total = subtotal;
        total += CARGO_FIJO_INSCRPCION;
        var saldoDespuesPagar = saldoEquipo - total;
        //Verificar quien tiene pareja y quien no
        var tienePareja = cantidadJugadores / 2;
        var noPareja = cantidadJugadores % 2;
        
        
        //Tratamiento de los textos y generacion de codigo
        nombreEquipo = nombreEquipo.strip().toUpperCase();
        nombreCapitan = nombreCapitan.strip();
        apellidoCapitan = apellidoCapitan.strip();
        juegoParticipando = juegoParticipando.strip().toUpperCase();
        
        //Crear nombre completo del capitan
        var nombreCompletoCapitan = nombreCapitan  + " "+ apellidoCapitan;
        
        //Generar el Alias del equipo
        var aliasCapitan = nombreCapitan.substring(0, 2) + apellidoCapitan;
        aliasCapitan = aliasCapitan.toLowerCase();
        
        
        //Generar el codigo de cotizacion
        var codigoCotizacion = nombreCapitan.substring(0, 1).toUpperCase()
                + apellidoCapitan.substring(apellidoCapitan.length()-1).toUpperCase() + numeroAleatorio;
        
        //Reglas para la incripcion del torneo
        var enRangoJugadores = cantidadJugadores >= 2 && cantidadJugadores <=5; //Rango de 2 a 5
        var rangoEdadCapitan = edadCapitan >= 18; //Rango de mayor de eddad(18)
        var cumpleSaldo = saldoEquipo >= total;
        var noSuspecion = estaSuspendido == false; //No estan suspendidos
        var participaSorteo = tieneMembresia || tieneCupon;
        var puedeIncribirse = saldoEquipo >= total && noSuspecion == true && edadCapitan >= 18
                && cantidadJugadores >= 2 && cantidadJugadores <=5;
                
        
        //Impresion del ticket final
        System.out.println("");
        System.out.println(TITULO_IMPRESION);
        System.out.printf("""
                          Codigo de cotizacion: %S
                          Equipo: %s
                          Capitan: %S
                          Alias del capitan: %s
                          VideoJuego: %s
                          Jugagores: %d
                          
                          Subtotal: $%.2f
                          Cargo fijo: $%.2f
                          Total: $%.2f
                          Saldo despues del pago: $%.2f
                          Parejas: %d
                          Jugadores sin pareja: %d
                          
                          CantidadPermitida? : %b
                          Capitan mayor de edad? : %b
                          Saldo suficiente? : %b
                          Acceso al sorteo? : %b
                          Puede incribirse? : %b
                          """, codigoCotizacion, nombreEquipo, nombreCompletoCapitan,
                          aliasCapitan, juegoParticipando, cantidadJugadores,
                          subtotal, CARGO_FIJO_INSCRPCION, total, saldoDespuesPagar,
                          tienePareja, noPareja, enRangoJugadores, rangoEdadCapitan,
                          cumpleSaldo, participaSorteo, puedeIncribirse);
        
    }
    
}
