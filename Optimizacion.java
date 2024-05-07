import java.util.Arrays;
import java.math.*;



// Git hub me tiene loca



public class Optimizacion{
    public static int multiplicar(int a, int b) {
        //Renombrado y sustitucion de bloques (ya esta optimizada)
        return a * b ;
    }

    public static int array(int[] arr) {
        int m = -1000000;
        Arrays.sort(arr);
        System.out.println(arr[0]);
        return m;
    }

    public static int potencia(int base, int exponente) {
        
         int resultado;
        resultado = Math.pow(base, exponente);
        return resultado;

    }
    
    

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * f4(n-1);
        }
    }

    public static void main(String[] args) {
        // prueba f1
        int a = 4;
        int b = 5;
        int ar = f1(a, b);
        System.out.println("El ???? es " + ar);

        // prueba f2
        int[] arr = {5, 2, 7, 4, 1, 9};
        int m = f2(arr);
        System.out.println("El ??? del array es " + m);

        // prueba f3
        int ba = 3;
        int ex = 4;
        int resultado = f3(ba, ex);
        System.out.println(ba + " ??? a " + ex + " es igual a " + resultado);

        // prueba f4
        int num = 6;
        int fa = f4(num);
        System.out.println("El ??? de " + num + " es " + fa);
    }
}
