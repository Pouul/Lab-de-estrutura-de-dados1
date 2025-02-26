import java.util.Scanner;

public class Ex8{
    public static boolean  haColisaoEntreCirculos(float r1,float x1,float y1,float r2,float x2,float y2){
        float a = math.ads(x1-x2);
        float b = math.ads(y1-y2);
        float c = Math.sqrt((a*a)+(b*b));
        if (c = 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o raio1: ");
        float r1 = entrada.nextFloat();
        System.out.print("digite o x1: ");
        float x1 = entrada.nextFloat();
        System.out.print("digite o y1: ");
        float y1 = entrada.nextFloat();
        System.out.print("digite o raio2: ");
        float r2 = entrada.nextFloat();
        System.out.print("digite o x2: ");
        float x2 = entrada.nextFloat();
        System.out.print("digite o y2: ");
        float y2 = entrada.nextFloat();

        if(haColisaoEntreCirculos(r1,x1,y1,r2,x2,y2)){
            System.out.println("Há colisão");
        }
        else{
            System.out.println("Não há colisão");
        }
    }
}