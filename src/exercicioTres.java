import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        String inverte = "";

        for (int i = nome.length() -1; i >= 0; i--) {
            char letra = nome.charAt(i);
            inverte = inverte + letra;
        }

        System.out.println(inverte);
    }
}
