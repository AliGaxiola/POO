import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = ThreadLocalRandom.current().nextInt(500, 1000 + 1);

        pajaroTriple pajaro_1 = new pajaroTriple("Azul","Ovalado", 300);
        pajaroTriangulo pajaro_2 = new pajaroTriangulo("Amarillo", "Triangular", 400);
        pajaroBomba pajaro_3 = new pajaroBomba("Negro", "Circulo", num);

        System.out.println("El color del Pajaro Triple es: "+pajaro_1.getColor());
        System.out.println("El color del Pajaro Triangulo es: "+pajaro_2.getColor());
        System.out.println("El color del Pajaro Bomba es: "+pajaro_3.getColor());
        System.out.println("");

        System.out.println("La forma del Pajaro Triple es: "+pajaro_3.getForm());
        System.out.println("La forma del Pajaro Triangulo es: "+pajaro_3.getForm());
        System.out.println("La forma del Pajaro Bomba es: "+pajaro_3.getForm());
        System.out.println("");

        boolean salir = false;
        int opc = 0;

        do {
            System.out.println("Selecciones el pajaro que quieres lanzar!\n");
            System.out.println("1- Pajaro Triple");
            System.out.println("2- Pajaro Triangulo");
            System.out.println("3- Pajaro Bomba");
            System.out.println("4 - Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    pajaro_1.Triplicar();
                    break;
                case 2:
                    pajaro_2.Velocidad();
                    break;
                case 3:
                    pajaro_3.Explosion();
                    break;
                case 4:
                    salir = true; break;
                default:
                    System.out.println("No esta disponible ese pajaro bro");
                    break;
            }
        }while(!salir);
        System.out.println("Adios!");
    }
}
