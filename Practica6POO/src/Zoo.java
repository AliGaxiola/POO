import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, opc = 0, n = 0;
        String nombre = null;

        Animal animal[] = new Animal[5];
        Veterinarian veterinario = new Veterinarian("Jose Luis del Monte Quemado", 20);

        animal[0] = new Perro("Firulais", "Macho", 4, false, false);
        animal[1] = new Gato("Nieves", "Macho", 5, false, false);
        animal[2] = new Cebra("Melvin", "Macho", 5, false, false);
        animal[3] = new Oso("Meloso", "Macho", 6, false, false);
        animal[4] = new Leon("", "Macho", 7, false, false);

        do {
            System.out.println("\n");
            System.out.println("1) Capturar los datos de un animal");
            System.out.println("2) Eliminar datos de un animal");
            System.out.println("3) Datos de un animal");
            System.out.println("4) Revision con veterinario");
            System.out.println("5) Salir\n");
            System.out.println("Seleccione la opcion deseada: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    ArrayList<Animal> lista = new ArrayList<Animal>(Arrays.asList(animal));
                    Animal a = new Animal(Captura.capturarString("Nombre : "),Captura.capturarString("Sexo : "), Captura.capturarEntero("Edad: "), false, false);
                    lista.add(a);
                    animal = new Animal[lista.size()];
                    lista.toArray(animal);
                    break;

                case 2:
                    System.out.print("Nombre del animal: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    n = buscar(animal, nombre);
                    ArrayList<Animal> lista1 = new ArrayList<Animal>(Arrays.asList(animal));
                    lista1.remove(n);
                    animal = new Animal[lista1.size()];
                    lista1.toArray(animal);
                    break;

                case 3:
                    System.out.print("Nombre del animal: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    n = buscar(animal, nombre);
                    datos(animal[n]);
                    break;

                case 4:
                    for (int j = 0; j < animal.length; j++) {
                        System.out.println("\nAnimal #" + (j + 1)+": ");
                        veterinario.vacunar(animal[j]);
                        datos(animal[j]);
                        veterinario.darComida(animal[j]);
                        veterinario.examinar(animal[j]);
                    }
                    break;

                case 5:
                    System.out.println("Vuelva pronto!!");
                    break;
                default:
                    System.out.println("Ingrese una opcion existente.");
            }
        }while (opc != 5) ;
    }

    public static int buscar(Animal a[], String nombre){
        int indice=0;
        for(int i=0; i<a.length; i++) {
            if(nombre.equals(a[i].getNombre())) {
                indice=i;
                break;
            }
        }
        return indice;
    }

    public static void datos(Animal a) {
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Estado de vacunacion: " + a.getVacuna());
    }
}