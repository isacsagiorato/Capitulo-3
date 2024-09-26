import java.util.Scanner;

public class Exercicio3$6 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int num;

        System.out.println("Forneca um numero maior ou igual a zero: ");
        num= Integer.parseInt(scan.nextLine());

        if(num<0){
            System.out.println("Valor incorreto (negativo)");
        }

        for(int i=num; i>=0; i--){
            System.out.printf("%d ",i);

        }
        scan.close();
    }
    
}
