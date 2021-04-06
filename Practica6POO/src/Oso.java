public class Oso extends Animal{

    public Oso(String nombre,String sexo, int edad, boolean vacuna, boolean alimento) {
        super(nombre,sexo,edad,vacuna, alimento);
    }

    @Override
    public void Dormir() {
        System.out.println("\nEl Oso "+nombre+" esta durmiendo");
    }

    @Override
    public void Comida(){
        System.out.println("El oso "+nombre+" esta comiendo miel.");
    }

    public void Bailar(){
        System.out.println("\nEl Oso "+nombre +" esta bailando");
    }
}
