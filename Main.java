public class Main{
    public static void main(String[] args){
        System.out.println("Torneo entre ligas de USA \n");
        Torneo torneo  = new Torneo("Grandes ligas", "Americana", 5, 5,2);
        torneo.agregarEquipos();
        System.out.println("\n");
        torneo.datosTorneo();
    }
}
