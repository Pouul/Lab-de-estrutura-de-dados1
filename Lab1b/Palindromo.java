

import java.util.Scanner;

class Palindromo{

     private String texto;

    Palindromo(){
        
    }

    public Palindromo(String frase){
        this.texto=frase;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String frase){
        if (frase.isEmpty()){
            System.out.println("erro de entrada");
        }
        else{
            this.texto = frase;
        }
    }

    public boolean verificar(){
        int tamanho = texto.length();
        int Liguais = 0;
        int vezes = tamanho/2;
        for (int i=0;i<vezes;i++){
            if (texto.charAt(i) == texto.charAt(tamanho-i-1)){
                Liguais++;
            }
        }
        if(Liguais == vezes){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite a palavra: ");
        String frase = entrada.nextLine();
        Palindromo p = new Palindromo();
        p.setTexto(frase);
        if (p.verificar()){
            System.out.println("é palindromo");
        }
        else{
            System.out.println("não é palindromo");
        }
    }
}

