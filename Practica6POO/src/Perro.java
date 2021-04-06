public class Perro extends Animal {

    public Perro(String nombre,String sexo, int edad, boolean vacuna, boolean alimento) {
        super(nombre,sexo,edad,vacuna, alimento);
    }

    @Override
    public void Comida() {
        System.out.println("\n"+nombre+" come croquetas");
    }

    @Override
    public void Dormir() {
        System.out.println("\nEl perro "+nombre+" esta durmiendo");
    }

    public void Ladrar() {
        System.out.println("\nEl perro "+nombre+" esta ladrando");
    }
}
