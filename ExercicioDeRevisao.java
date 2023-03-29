import java.util.Scanner;

public class ExercicioDeRevisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[3];
        double contas[][] = new double[4][4];
        int escolha;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = scanner.nextLine();
        }

        ExibirNomes(nomes);

        TestaNomes(nomes);

        ExibeMatriz(contas);


    }

    public static void ExibirNomes(String[] nomes) {

        System.out.printf("Nomes digitados: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf(nomes[i]);
            System.out.printf(" ");
        }
    }

    public static void TestaNomes(String[] nomes) {
        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero inteiro: ");
            escolha = scanner.nextInt();
            if (escolha == 1) {
                System.out.println(nomes[0]);
            } else if (escolha >= 2 && escolha <= 10) {
                System.out.println(nomes[1]);
            } else if (escolha > 10) {
                System.out.println(nomes[2]);
            } else
                System.out.println("Opcao invalida");

        }
    }

    public static void ExibeMatriz(double[][] contas) {
        Scanner scanner = new Scanner(System.in);

        double[] valor = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            valor[i] = scanner.nextDouble();
        }

        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 4; coluna++) {
                if (linha == 0){
                    contas[0][1] = valor[0];
                    contas[0][2] = valor[1];
                    contas[0][3] = valor[2];
                }else if (coluna == 0){
                    contas[1][0] = valor[0];
                    contas[2][0] = valor[1];
                    contas[3][0] = valor[2];
                }else if (linha == coluna){
                    contas[linha][coluna] = valor[coluna - 1] * valor[coluna - 1] ;
                }else if (linha == 1 && coluna == 2 || coluna == 3){
                    contas[1][2] = valor[0] - valor[1];
                    contas[1][3] = valor[0] - valor[2];
                }else if (linha == 2 && coluna ==1 || coluna ==3){
                    contas[2][1] = valor[1] - valor[0];
                    contas[2][3] = valor[1] - valor[2];
                }else if (linha == 3 && coluna == 1 || coluna == 2){
                    contas[3][1] = valor[2] - valor[0];
                    contas[3][2] = valor[2] - valor[1];
                }
            }
        }
    }
}