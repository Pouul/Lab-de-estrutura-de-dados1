import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro numero: ");
        int v1= scanner.nextInt();

        System.out.print("digite o segundo numero: ");
        int v2= scanner.nextInt();

        int aux=0;
        aux=v1;
        v1=v2;
        v2=aux;

        System.out.println("o primeiro numero ficou: "+ v1);
        System.out.println("o segundo numero ficou: "+ v2);
    }
}