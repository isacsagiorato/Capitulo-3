import java.util.Scanner;

public class Exercicio3$11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num1;
        int num2;


        System.out.println("N1: ");
        num1= Integer.parseInt(scan.nextLine());
        System.out.println("N2: ");
        num2= Integer.parseInt(scan.nextLine());

        if(num1<=num2){
            for(int i=num1; i<=num2; i++){

                System.out.printf("%d ",i);
            }

        }
        else if(num1>num2){
            for(int i=num1; i>=num2; i--){
                
                System.out.printf("%d ",i);

            }


        }


        

    }
}
