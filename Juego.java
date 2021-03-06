
package ende;

/**
 * Simula el juego de Piedra, Papel o Tijera
 */
public class Juego {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        boolean finDeJuego = false;
        int Rondasjugadas = 0;
        int exitosJugador1 = jugador1.exitos;
        int exitosJugador2 = jugador2.exitos;
        int empates = 0;
        String opcionJugador1;
        String opcionJugador2;

        do {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcionJugador1=jugador1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = jugador2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);

            if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++jugador2.exitos;

            } else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador1 = ++jugador1.exitos;
                System.out.println("Jugador 1 GANA");

            } else if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador1 = ++jugador1.exitos;
                System.out.println("Jugador 1 GANA");

            } else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
            	exitosJugador2 = ++jugador2.exitos;
                System.out.println("Jugador 2 GANA");

            } else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
            	exitosJugador1 = ++jugador1.exitos;
                System.out.println("Jugador 1 GANA");

            } else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
            	exitosJugador2 = ++jugador2.exitos;
                System.out.println("Jugador 2 GANA");

            }

            if (opcionJugador1.equals(opcionJugador2)) {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");

            }

            Rondasjugadas++;

            if ((jugador1.exitos >= 3)||(jugador2.exitos >= 3)) {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");

            }

            System.out.println();

        } while (!finDeJuego);
    }
}
