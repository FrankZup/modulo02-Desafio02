import java.util.*;

public class CadastroDeContatos {

    public static List<String> criarListaDeContatos() {
        List<String> contatos = new ArrayList<>();
        String nomeContato = "";

        System.out.println("Digite o nome do contato para cadastrar: ");
        nomeContato = new Scanner(System.in).nextLine();

        return contatos;

    }

    public static void main(String[] args) {

        Map< String,List<String>> listaDeContatos = new HashMap<>();

        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite: \n1 para cadastrar\n2 para excluir ou \n3 para sair ");
            int resposta = new Scanner(System.in).nextInt();

            if (resposta == 1) {

                List<String> contatos = criarListaDeContatos();

                System.out.println("Digite seu telefone:");
                String telefone = new Scanner(System.in).nextLine();
                System.out.println("Digite seu e-mail:");
                String email = new Scanner(System.in).nextLine();

                listaDeContatos.put(email, contatos);

            } else if (resposta == 2) {
                System.out.println("Digite o e-mail do contato que deseja excluir:");
                String emailContato = new Scanner(System.in).nextLine();

                if (listaDeContatos.containsKey(emailContato)){
                    listaDeContatos.remove(emailContato);
                    System.out.println("O contato removido foi = "+emailContato);
                } else {
                    System.out.println("Contato não encontrado!");
                }
            } else if (resposta == 3) {
                System.out.println("O programa será encerrado");
                continuar = false;
            }
        }
    }
}
