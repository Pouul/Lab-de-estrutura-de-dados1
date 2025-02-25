package Lab1b;

import java.util.Scanner;

class Palindromo{

     private String texto;

    Palindromo(){
        this.texto="";
    }

    public Palindromo(String frase){
        this.texto=frase;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String frase){
        if (frase==null){
            throw new IllegalArgumentException("erro de entrada");
        }
        this.texto = frase;
        }
    public boolean verificar(String texto){
        int tamanho = texto.length();
        int vezes =tamanho/2;
        for (int i=0;vezes>=i;i++){
            
        }
    }
    
}

