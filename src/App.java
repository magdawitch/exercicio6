import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //1: Pedir o raio de um círculo

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o raio do círculo: ");

        double raio = sc.nextDouble();

        sc.close();

        //2: Calcular a área do círculo
        //=PI() * POTÊNCIA(C3;2)

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo de raio " + raio + " é igual a " + area);


    }
}
