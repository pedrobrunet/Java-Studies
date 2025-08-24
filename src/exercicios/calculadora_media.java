import java.util.ArrayList;
import java.util.Scanner;

public class calculadora_media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        int valormediafinal = 7;

        double notafinal = (nota1 + nota2 + nota3) / 3;

        if (notafinal >= valormediafinal)
        {
            System.out.println("Aprovado com média: " + notafinal);
        } else {
            System.out.println("Reprovado com média: " + notafinal);
        }

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Prova " + (i + 1) + ": " + notas.get(i));
        }


    }

}
