import java.util.Scanner;


public class Ex6 {

    public static float mulComAdicao(int a, float b){
        float multiplicação = 0;
        for (int i=0; i<a ;i++){
            multiplicação = multiplicação + b;
        }
        return multiplicação;
    }



    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int numeroInt = entrada.nextInt();
        System.out.print("digite o segundo numero: ");
        Float numeroFloat = entrada.nextFloat();

        float resultato = mulComAdicao(numeroInt,numeroFloat);
        System.out.println(String.format("Multiplicação: %.2f", resultato));
        
        
    }
}