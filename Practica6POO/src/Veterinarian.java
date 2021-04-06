public class Veterinarian {
    String nombre;
    int edad;

    public Veterinarian(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void vacunar(Animal animal) {
        animal.setVacuna(true);
        System.out.println(animal.getNombre()+" **ha sido vacunado**");
    }

    public void darComida(Animal animal) {
        animal.setAlimento(true);
        System.out.println(animal.getNombre()+" **ha ingerido comida**");
    }

    public void examinar(Animal animal) {
        System.out.println("\nEl veterinario "+nombre+" le hizo una revision a " + animal.getNombre());
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
