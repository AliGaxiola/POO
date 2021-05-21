import java.util.Scanner;

class CapturaEntrada{
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println("" + msg+":");
        return (sc.nextInt());
    }
    public static float CapturarFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println("" + msg+":");
        return (sc.nextFloat());
    }
    public static String CapturarString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println("" + msg+ ":");
        return (sc.nextLine());
    }
}
