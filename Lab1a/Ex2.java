import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("é vogal");
        }
        else {
            System.out.println("é consoantes");
        }
    }
}