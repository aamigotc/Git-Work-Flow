

package ende;
/**
 *  Abtracción de un Jugador al Piedra, Papel o Tijera.
 */
class Jugador {
    public static final String PIEDRA = "piedra";
    public static final String PAPEL = "papel";
    public static final String TIJERAS = "tijeras";
    int exitos;

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar() {
        String opcion;
        int num = (int) (Math.random() * 3);
        switch (num) {
            case 0:
                opcion = PIEDRA;
                break;
            case 1:
                opcion = PAPEL;
                break;
            case 2:
                opcion = TIJERAS;
                break;
            default:
                opcion = "";
        }
        return opcion;
    }

    public void setExitos() {
        exitos++;
    }
    public int getExitos() {
        return(exitos);
    }

}

