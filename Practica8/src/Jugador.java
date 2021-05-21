public class Jugador{
    int dorsal, puntosAnotados;
    float estatura;
    String nombreJugador, posicion;
    public Jugador(int dorsal, int puntosAnotados, float estatura, String nombreJugador,
                   String posicion){
        this.dorsal = dorsal;
        this.puntosAnotados = puntosAnotados;
        this.estatura = estatura;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
    }
    public String getNombre(){
        return nombreJugador;
    }
    public int getDorsal(){
        return dorsal;
    }
    public float getEstatura(){
        return estatura;
    }
    public String getPosicion(){
        return posicion;
    }
    public int getPuntos(){
        return puntosAnotados;
    }
}