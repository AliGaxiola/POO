public class Gato extends Animal{

    public Gato(String nombre,String sexo, int edad, boolean vacuna, boolean alimento) {
        super(nombre,sexo,edad,vacuna, alimento);
    }

    @Override
    public void Comida() {
        System.out.println("\n"+nombre+" esta comiendo atun");
    }

    @Override
    public void Dormir() {
        System.out.println("\nEl gato " +nombre+" esta durmiendo");
    }

    public void Ronronear() {
        System.out.println("\nEl gato "+nombre+" esta ronroneando");
    }
}
