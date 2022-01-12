
import java.util.Scanner;



public class ProgrModBas_EX6
{

    // 6. (sumaArray) Fer una funció que rebi un vector numèric i retorni la suma dels seus elements:

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] vectorX = new int[2];

        System.out.println("Introduzca 2 valores en el vector: ");

        for(int i = 0; i < vectorX.length; i++)
        {
            vectorX[i]= sc.nextInt();
        }

        recibeVectorYSuma(vectorX);

    }


    public static void recibeVectorYSuma(int [] vectorX)
    {
        int suma = 0;

        for(int i = 0; i < vectorX.length; i++)
        {
            suma += vectorX[i];
        }

        System.out.println("------------------------------------------------------");


        System.out.println("El resultado de la suma de los valores del vector es: " + suma);

    }

}
