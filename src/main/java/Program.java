import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        int[][] nomeMatriz = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                nomeMatriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Diagonal");
        for  (int i = 0; i < n; i++){
            System.out.println(nomeMatriz[i][i] + " ");
        }

        int contar = 0;
        for  (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                if (nomeMatriz[i][j] < 0){
                    contar++;
                }
            }
        }
        System.out.println("numeros negativos: " + contar);

        ler.close();

    }
}
