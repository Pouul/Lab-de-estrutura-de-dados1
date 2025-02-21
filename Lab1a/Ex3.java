import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double [] numeros= new double[10];
        double maior=0;
        double menor=0;

        for (int i=0; i<=10; i++){
            nums[i]=scanner.nextInt();
        }
        for (int i=0; i<=10; i++){
            for (int j=0; j<=10; j++){
                if(numeros[i]>numeros[j]){
                    double aux=0;
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
        for (int i=0; i<=10; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}