import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.*;

public class Alumno implements Serializable {
    String nombre;
    Calificaciones cal[];
    int promedio, matricula;

    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setMatricula(int mat) {
        matricula = mat;
    }
    public void setPromedio(int prom) {
        promedio = prom;
    }

    public void getCalificaciones() {
        for (int i = 0; i < cal.length; i++) {
            System.out.println(cal[i].getCalificacion());
        }
    }

    public void setCalificaciones(int nummat) {
        cal = new Calificaciones[nummat];

        for (int i = 0; i < nummat; i++) {
            cal[i] = new Calificaciones();
            cal[i].calificacion = calificacionesCsv[(int) (Math.random() * 21)];
        }
    }

    public int[] soloCal() {
        int[] soloc = new int[cal.length];
        for (int i = 0; i < cal.length; i++) {
            soloc[i] = cal[i].calificacion;
        }
        return soloc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getPromedio() {
        return promedio;
    }

    int[] calificacionesCsv = new int[21];

    {
        calificacionesCsv[0] = 67;
        String fileName = "practica9.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                String[] values = data.split(",");
                for (int i = 1; i < values.length; i++) {
                    calificacionesCsv[i] = Integer.parseInt(values[i]);
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}