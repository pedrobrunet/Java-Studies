package conceitos.POO;

public class ModificadoresDeAcesso {

    // Acessível de qualquer lugar.
    public String publico = "Acesso de qualquer lugar do projeto.";

    // Acessível apenas no mesmo pacote.
    String padrao = "Acesso apenas dentro deste pacote.";

    // Acessível no mesmo pacote e em subclasses.
    protected String protegido = "Acesso no pacote e em subclasses.";

    // Acessível apenas dentro desta classe.
    private String privado = "Acesso restrito a esta classe.";


    public static void main(String[] args) {
        ModificadoresDeAcesso demo = new ModificadoresDeAcesso();

        System.out.println("Acesso ao atributo público: " + demo.publico);
        System.out.println("Acesso ao atributo padrão: " + demo.padrao);
        System.out.println("Acesso ao atributo protegido: " + demo.protegido);

        // A linha abaixo causaria um erro de compilação
        // System.out.println(demo.privado);
    }
}