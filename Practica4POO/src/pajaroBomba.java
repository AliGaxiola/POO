import java.util.concurrent.ThreadLocalRandom;
public class pajaroBomba extends Pajaro{

    public pajaroBomba(String color, String form, int damage){
        super(color, form, damage);
    }

    public void Explosion(){
        int num = ThreadLocalRandom.current().nextInt(500, 1000 + 1);
        System.out.println("El pajaro bomba exploto y genero un daño de: "+num);
    }

}
