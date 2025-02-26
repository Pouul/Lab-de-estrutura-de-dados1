import java.util.Scanner;


public class Ex4 {
    public static void main (String[] args){
        int vetor[]=new int[10];
        Scanner entrada = new Scanner(System.in);

        
        for(int i=0;i<10;i++){
            System.out.print("digite os numeros: ");
            vetor[i]= entrada.nextInt();
        }

        for(int i=0;i<10;i++){
            
            System.out.println("o " + (i+1) + " numero é : " + vetor[9 - i]);
        }
       
    }
}