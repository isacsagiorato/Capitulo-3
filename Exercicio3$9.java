import java.util.Scanner;

public class Exercicio3$9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int numero;
        int tabuada;
        int resultado;

        System.out.println("Tabuada do Numero: ");
        numero= Integer.parseInt(scan.nextLine());

        for(tabuada=0; tabuada<=10; tabuada++){

            resultado= numero*tabuada;

            System.out.printf("%d x %d = %d\n",numero,tabuada,resultado);


        }
        scan.close();
    }
    
}
