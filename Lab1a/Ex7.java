import java.util.Scanner;

public class Ex7{
    public static int contarVogais(String palavra){
        int tamanho = palavra.length();
        int nVogal = 0;
        for(int i=0; i<tamanho;i++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u'){
                nVogal++;
            }
        }
        return nVogal;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o palavra: ");
        String palavra = entrada.nextLine();

        int qVogal = contarVogais(palavra);
        System.out.println("quantidade de vogais é :" + qVogal);

    }
}