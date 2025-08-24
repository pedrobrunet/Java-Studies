
import java.util.ArrayList;
public class Fundamentos {

    public static void main(String[] args) {
        /*

         Formas de declarar variáveis

         TIPO 1: Declaração explícita de tipo
         tipo nomeVariavel = valor;
         Exemplo:

        int teste = 2;
        String pessoa = "hoje";  'String' precisa ter 'S' maiúsculo e o valor de String deve estar entre aspas duplas ""
        float test1 = 3.3f;  Para float, é boa prática adicionar o sufixo 'f' (ou 'F') para indicar que é um literal float.
         Além disso, use ponto '.' como separador decimal.

       TIPO 2: Usando VAR (inferência de tipo - a partir do Java 10)
        Usando VAR, o compilador infere o tipo da variável com base no valor atribuído.
        Exemplo:
        var nomeVariavel = "pedro";  O compilador infere que 'nomeVariavel' é do tipo String.
        var idade = 25;  O compilador infere que 'idade' é do tipo int.
        var preco = 19.99; O compilador infere que 'preco' é do tipo double (tipo padrão para números decimais sem 'f').

       TIPOS PRIMITIVOS

       NUMEROS INTEIROS E DECIMAIS
        byte => 8 bits => -128 a 127
        short => 16 bits =>-32.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.483.647
        long => 64  bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

       NUMEROS DECIMAIS
        float => 32 bits => -3.40282347E+38 a 3.40282347E+38 (use 'f' ou 'F' no final)
        double => 64 bits => -1.79769313486231570E+308 a 1.79769313486231570E+308 (padrão para números decimais, não precisa de sufixo)

      String => Não é um tipo primitivo, mas é usado para representar texto. É uma classe em Java.
      char => 16 bits => Representa um único caractere Unicode (ex: 'A', '1', '@'). Deve ser colocado entre aspas simples ''.

      boolean => Representa um valor lógico, podendo ser true ou false

                */

        // Condicional simples
        int teste = 2;

        if (teste > 0) {
            System.out.println("O valor de teste é positivo.");
        } else {
            System.out.println("O valor de teste é negativo ou zero.");
        }

        // Vetores (Arrays)

        String[] nomes = {"João", "Maria", "Pedro"};
        System.out.println(nomes[1]); // Acessa o segundo elemento do array (índice 1)
        // * sempre declarar qual vai ser a quanitdade que esse vetor vai ter ( NUNCA DEIXAR VAZIO)

        // Listas (ArrayList)
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Ana");
        listaNomes.add("Carlos");
        System.out.println(listaNomes.get(0)); // Acessa o primeiro elemento da lista (índice 0)

        // Loops
        // for (tipo nome = valorinicial; nome < limite; oque vai fazer) {
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }
        // ou

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // While loop

        int contador = 0;
        while (contador < 11) {
            if(contador > 5){
                System.out.println("FIM");
                break;
            }
            System.out.println(contador);
            contador++;
        }







    }
}