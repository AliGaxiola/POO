public class Cebra extends Animal {

    public Cebra(String nombre,String sexo, int edad, boolean vacuna, boolean alimento) {
        super(nombre,sexo,edad,vacuna, alimento);
    }

    @Override
    public void Comida(){
        System.out.println("\nLa cebra "+nombre +" esta comiendo hierba.");
    }

    @Override
    public void Dormir() {
        System.out.println("\nla cebra "+nombre+" esta durmiendo");
    }

    public void Relinchar(){
        System.out.println("\nLa cebra "+nombre +" esta relinchando");
    }

}
