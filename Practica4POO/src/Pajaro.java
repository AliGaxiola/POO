public class Pajaro {
    String color;
    String form;
    int damage;

    public Pajaro(String color, String form, int damage) {
        this.color = color;
        this.form = form;
        this.damage = damage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
