

import java.util.Scanner;

class Palindromo{

    private String texto;

    Palindromo(){
        
    }
    public Palindromo(String texto){
        this.texto=setTexto(texto);
        
    }

    public String getTexto(){
        return texto;
    }

    public String setTexto(String texto){
        if (texto == null){
            System.out.println("erro de entrada");
            throw new Exception("Texto não pode ser nulo");
        }
        else{
            this.texto = texto;
        }
    }

    public boolean verificar(){
        int tamanho = texto.length();
        if (tamanho<=1){ 
            return true;
        }

        int vezes = tamanho/2;

        String aux = texto;
        aux = aux.toLowerCase();
        aux = aux.replaceAll(" ","");

        for (int i=0;i<vezes;i++){
            if (texto.charAt(i) != texto.charAt(tamanho-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Palindromo p = new Palindromo();
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite a palavra: ");
        String frase = entrada.nextLine();
        p.setTexto(frase);
        if (p.verificar()){
            System.out.println("é palindromo");
        }
        else{
            System.out.println("não é palindromo");
        }
    }
}

