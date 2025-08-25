import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class gerenciador_de_tarefas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaTarefas = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite a tarefa para adicionar: ");
                        String tarefa = scanner.nextLine();
                        listaTarefas.add(tarefa);
                        System.out.println("Tarefa adicionada: \"" + tarefa + "\"");
                        break;

                    case 2:
                        System.out.println("\n--- Suas Tarefas ---");
                        if (listaTarefas.isEmpty()) {
                            System.out.println("Nenhuma tarefa na lista.");
                        } else {
                            for (int i = 0; i < listaTarefas.size(); i++) {
                                System.out.println((i + 1) + ". " + listaTarefas.get(i));
                            }
                        }
                        break;

                    case 3:
                        if (listaTarefas.isEmpty()) {
                            System.out.println("Não há tarefas para remover.");
                            break;
                        }
                        System.out.print("Digite o número da tarefa que deseja remover: ");
                        int numeroTarefa = scanner.nextInt();
                        scanner.nextLine(); 
                    

                        if (numeroTarefa > 0 && numeroTarefa <= listaTarefas.size()) {
                            String tarefaRemovida = listaTarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida: \"" + tarefaRemovida + "\"");
                        } else {
                            System.out.println("Número de tarefa inválido. Por favor, digite um número da lista.");
                        }
                        break;

                    case 4:
                        rodando = false;
                        System.out.println("Saindo do gerenciador de tarefas. Até mais!");
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, escolha um número de 1 a 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa a entrada inválida do buffer
            }
        }
        scanner.close();
    }
}
