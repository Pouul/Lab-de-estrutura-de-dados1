import java.util.Scanner;


public class Ex5 {

    public static int min(int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }


    public static void main (String[] args){
        int vetor[]=new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        int minimo = min(numero1, numero2);
        int maximo = max(numero1, numero2);

        System.out.println("digite o minimo é: " + minimo);
        System.out.println("digite o maximo é: " + maximo);
    }
}