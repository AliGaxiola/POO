public class Operaciones {

    public static int CalcularP(int[] soloCali){
        int suma=0, prom;
        for (int i = 0; i < soloCali.length; i++){
            suma = suma+soloCali[i];
        }
        prom = suma / soloCali.length;
        return prom;
    }
}
