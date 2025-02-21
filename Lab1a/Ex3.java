import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double [] numeros= new double[10];
        double maior=0;
        double menor=0;

        for (int i=0; i<10; i++){
            System.out.print("coloque o numero: ");
            numeros[i]=scanner.nextInt();
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if(numeros[i]>numeros[j]){
                    double aux=0;
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
        System.out.println();

        maior=numeros[9];
        menor=numeros[0];

        System.out.println("O maior numero é "+ maior);
        System.out.print("O menor numero é "+ menor);
    }
}