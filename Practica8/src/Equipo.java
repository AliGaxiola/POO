import java.util.ArrayList;

public class Equipo {
    String nombreEquipo, division, nombreEntrenador;
    int torneosParticipados, torneosGanados, torneosPerdidos;
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    public Equipo(String nombreEquipo, String division, String nombreEntrenador, int torneosParticipados,
                  int torneosGanados, int torneosPerdidos){
        this.nombreEquipo = nombreEquipo;
        this.nombreEntrenador = nombreEntrenador;
        this.division = division;
        this.torneosParticipados = torneosParticipados;
        this.torneosPerdidos = torneosPerdidos;
        this.torneosGanados = torneosGanados;
    }
    int cantJugadores = 10;
    public void agregarJugadores(){
        String nombreJugador,posicion;
        int dorsal, puntosAnotados;
        float estatura;
        int i = 1,terminar = 1;
        int aux = -1;
        while(i < 11){
            do{
                nombreJugador = CapturaEntrada.CapturarString("Nombre del jugador "+i);
                posicion = CapturaEntrada.CapturarString("Posicion del jugador");
                dorsal = CapturaEntrada.capturarEntero("Dorsal del jugador");
                puntosAnotados = CapturaEntrada.capturarEntero("Puntos anotados por ese jugador");
                estatura = CapturaEntrada.CapturarFloat("Estatura del jugador (en mts)");
                if((estatura < 0) || (estatura > 4)||(puntosAnotados < 0)||(dorsal < 0)) System.out.println("Error, ingrese un valor permitido.");
                else terminar = 0;
                if(dorsal == aux){System.out.println("El numero del dorsal ya esta seleccionado"); terminar = 1;}
                else aux = dorsal;

                String auxiliarNombre = nombreJugador;
                for(Jugador j:jugadores){
                    if(j.getNombre().equals(auxiliarNombre)){
                        System.out.println("No se puede repetir el jugador o estar en diferentes equipos");
                        terminar = 1;
                    }
                    else auxiliarNombre = j.getNombre();
                }

            }while(terminar != 0);
            terminar = 1;
            i++;
            Jugador nuevoJugador = new Jugador(dorsal,puntosAnotados,estatura,nombreJugador,posicion);
            jugadores.add(nuevoJugador);
        }
    }
    public int puntosTotales(){
        int puntosTotales = 0;
        for(int i = 0; i < jugadores.size();i++){
            puntosTotales += jugadores.get(i).getPuntos();
        }
        return puntosTotales;
    }
    public void mostrarJugadores(){
        System.out.println("Nombre / Dorsal de jugador");
        for(int i = 0; i < jugadores.size(); i++){
            System.out.println(jugadores.get(i).getNombre()+":"+jugadores.get(i).getDorsal());
        }
    }
    public void datosEquipo(){
        System.out.println(nombreEquipo +","+division);
    }
    public String getnombreEquipo(){
        return nombreEquipo;
    }
    public String getnombreEntrenador(){
        return nombreEntrenador;}
    public String getDivision(){return division;
    }
    public int gettorneosParticipados(){
        return torneosParticipados;
    }
    public int gettorneosPerdidos(){
        return torneosPerdidos;
    }
    public int gettorneosGanados(){
        return torneosGanados;
    }
}
