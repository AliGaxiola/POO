import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args){
        int n = 3;
        int nummat = 7;
        Alumno a[] = new Alumno[n];

        a[0] = new Alumno();
        a[0].setNombre("Edwish Ali");
        a[0].setMatricula(1271297);
        a[0].setCalificaciones(nummat);

        a[1] = new Alumno();
        a[1].setNombre("Gaxiola");
        a[1].setMatricula(12345678);
        a[1].setCalificaciones(nummat);

        a[2] = new Alumno();
        a[2].setNombre("Gerardo");
        a[2].setMatricula(12712970);
        a[2].setCalificaciones(nummat);

        for (int i = 0; i <  n ; i++){
            System.out.println("\n--------------------"+"\nAlumno: " + a[i].getNombre()+"\nMatricula: " +a[i].getMatricula());
            System.out.println("\nCalificaciones:");
            a[i].getCalificaciones();
            a[i].setPromedio(Operaciones.CalcularP(a[i].soloCal()));
            System.out.println("\nPromedio: "+ a[i].getPromedio());
            System.out.println("--------------------");
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("Alumnos.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(a[0]);
            objectOut.writeObject(a[1]);
            objectOut.writeObject(a[2]);
            objectOut.close();
            System.out.println("Archivo creado exitosamente. ");
            System.out.println("--------------------");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

