public class Leon extends Animal{

    public Leon(String nombre,String sexo, int edad, boolean vacuna, boolean alimento) {
        super(nombre,sexo,edad,vacuna, alimento);
    }

    @Override
    public void Comida() {
        System.out.println("\nEl Leon "+nombre+" esta comiendo carne");
    }

    @Override
    public void Dormir() {
        System.out.println("\nEl leon "+nombre+" esta durmiendo");
    }
    public void Rugir(){
        System.out.println("\nEl Leon "+nombre +" esta rugiendo");
    }
}