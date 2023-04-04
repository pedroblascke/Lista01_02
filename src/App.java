import java.util.Scanner;
    public class App {
        public static void main (String[] args) {

        //2- Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        double numero;
        Scanner teclado;

        System.out.print("Por favor, digite um número ");

        teclado = new Scanner(System.in);
        numero = teclado.nextDouble();
        teclado.close();

        System.out.print("O número informado foi " + numero);
        }
    }

