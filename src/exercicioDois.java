import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite o valor da posição " + i);
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0){

                vetor[i] *= 2;

            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);

            }

        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
