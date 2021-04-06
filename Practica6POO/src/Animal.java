public class Animal {
    String nombre;
    String sexo;
    int edad;
    boolean vacuna;
    boolean alimento;

    public Animal(String nombre, String sexo, int edad, boolean vacuna, boolean alimento) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.vacuna = vacuna;
        this.alimento = alimento;
    }

    public void Comida(){
        System.out.println(nombre + " esta comiendo." );
    }

    public void Dormir(){
        System.out.println(nombre + " esta durmiendo." );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public boolean getVacuna(){
        return vacuna;
    }

    public boolean getAlimento() {
        return alimento;
    }

    public void setAlimento(boolean alimento) {
        alimento = alimento;
    }
}
