

// Realiza operaciones matematicas basicas

public class p005_OpMatematicas {
    public static void main(String[] args) {
        float  x, y;
        float suma, resta, mult, divi, modu, pot;

        x = 10.5f ;
        y = 2.5f;


        suma = x + y;
        resta = x - y;
        mult = x * y;
        divi = x / y;
        modu = x % y;
        pot = (float)  Math.pow(x,y);

        System.out.printf("La suma de                %.2f + %.2f es %.2f \n",x,y,suma);
        System.out.printf("La resta de               %.2f - %.2f es %.2f\n",x,y,resta);
        System.out.printf("La multiplicacion de      %.2f * %.2f es %.2f\n",x,y,mult);
        System.out.printf("La divicion de            %.2f / %.2f es %.2f\n",x,y,divi);
        System.out.printf("La potencia de            %.2f ^ %.2f es %.2f\n",x,y,pot);
        System.out.printf("La modulo de              %.2f %% %.2f es %.2f\n",x,y,modu);
        
        



    }

}