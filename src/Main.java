import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero=0;
        String palo="";
        barajaEspanola();
        System.out.print("Numero: ");
        numero=input.nextInt();
        System.out.print("Palo: ");
        input.nextLine();
        palo=input.nextLine();
        CartaEspanola esp = new CartaEspanola(palo, numero);

        barajaFrancesa();
        numero=input.nextInt();
        System.out.print("Palo: ");
        input.nextLine();
        palo=input.nextLine();
        CartaFrancesa fra = new CartaFrancesa(palo, numero);

        System.out.println(esp.mostrarCarta());

        System.out.println(fra.mostrarCarta());


    }

    public static void barajaEspanola() {

        System.out.println("A continucacion se va pedir una carta española");
        System.out.println("Ruerda que hay 10 numeros y 4 palos ");
        System.out.println("Oros, Copas, Bastos y Espadas");




    }
    public static void barajaFrancesa() {

        System.out.println("A continucacion se va pedir una carta francesa");
        System.out.println("Ruerda que hay 13 numeros y 4 palos ");
        System.out.println("Corazones, Picas, Rombos y Treboles");
        System.out.print("Numero: ");




    }
}