import java.util.Scanner;

public class Captura {
    public static String capturarString(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int capturarEntero(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
