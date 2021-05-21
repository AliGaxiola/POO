import java.util.ArrayList;

class Torneo{
    String nombreTorneo, region;
    int numEquipos, partidosJugados, partidosPendientes;
    public Torneo(String nombreTorneo, String region, int numEquipos, int partidosPendientes,
                  int partidosJugados){
        this.nombreTorneo = nombreTorneo;
        this.region = region;
        this.numEquipos = numEquipos;
        this.partidosPendientes = partidosPendientes;
        this.partidosJugados = partidosJugados;
    }
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    public void agregarEquipos(){
        int terminar = 1, numEquipos = 1;
        while(numEquipos < 3){
            String nombreEquipo = CapturaEntrada.CapturarString("Nombre del equipo");
            String division = CapturaEntrada.CapturarString("Nombre de la division");
            String nombreEntrenador = CapturaEntrada.CapturarString("Nombre del entrenador");
            int torneosPerdidos,torneosParticipados, torneosGanados;
            do{
                torneosParticipados = CapturaEntrada.capturarEntero("Cantidad de torneos jugados");
                torneosPerdidos = CapturaEntrada.capturarEntero("Cantidad de torneos perdidos");
                torneosGanados = CapturaEntrada.capturarEntero("Cantidad de torneos ganados");
                if(torneosParticipados != (torneosPerdidos + torneosGanados)) System.out.println("Los torneos no encajan");
                else terminar = 0;
            }while(terminar!= 0);
            numEquipos++;
            Equipo nuevoEquipo = new Equipo(nombreEquipo,division,nombreEntrenador,torneosParticipados, torneosPerdidos, torneosGanados);
            System.out.println("10 jugadores por equipo.");
            nuevoEquipo.agregarJugadores();
            equipos.add(nuevoEquipo);
        }
    }
    public void datosTorneo(){
        System.out.println("En el torneo "+nombreTorneo+" hay "+numEquipos+" equipos  de la region "+region);
        System.out.println("Se han jugado "+partidosJugados+" partidos y quedan "+partidosPendientes+" pendientes");
        for(int i = 0; i < equipos.size(); i++){
            System.out.println("Equipo "+ (i+1)+": "+equipos.get(i).getnombreEquipo()+" - Puntos = "+equipos.get(i).puntosTotales()+" - Division = "+equipos.get(i).getDivision());
            equipos.get(i).mostrarJugadores();
        }
    }
}
