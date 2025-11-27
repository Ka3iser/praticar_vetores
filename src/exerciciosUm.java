import java.util.Scanner;

public class exerciciosUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();
        int[] vetor = new int[tamanhoVetor];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número da posição " + i);
            vetor[i] = sc.nextInt();
        }

        ordenaVetor(vetor);
        exibeVetor(vetor);

        System.out.println(); //pular linha

        sc.nextLine();

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        nome = nome.toLowerCase();

        char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u'};

        int contador = 0;
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);
            for (char vogal : vogais) {
                if (letra == vogal){
                    contador++;
                    break;
                }
            }
        }

        System.out.println("aqui está o numero de vogais que tem no nome digitado: " + contador);

        sc.close();
    }

    private static void exibeVetor(int[] tamanhoDoVetor){
        for (int i = 0; i < tamanhoDoVetor.length; i++){
            System.out.println(tamanhoDoVetor[i]);
        }
    }
    private static void ordenaVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
}
