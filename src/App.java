import entidades.Condutor;
import enums.CategoriaCarta;
import enums.InfracaoCategoria;
import infracoes.Infracao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar condutor
        System.out.println("Digite o nome completo do condutor :");
        String nome = scanner.nextLine();

        System.out.println("Digite o contacto:");
        String contacto = scanner.nextLine();

        Condutor condutor = new Condutor(nome, contacto);

        // Categoria da carta
        System.out.println("Categoria da carta \n" +
                "   \nLIGEIRO," +
                "   \nPESADO," +
                "   \nPROFISSIONAL," +
                "   \nTRANSPORTES_PUBLICOS ");
        try {
            condutor.setCategoriaCarta(CategoriaCarta.valueOf(scanner.nextLine().toUpperCase()));
        } catch (Exception e) {
            System.out.println("Categoria inválida!");
        }

        // Registrar várias infrações
        System.out.println("Quantas infrações deseja registar?");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Infracao infracao = new Infracao();

            // Categoria da infração
            boolean categoriaValida = false;
            while (!categoriaValida) {
                System.out.println("Categoria da infração: \n" +
                        "   \nLEVE," +
                        "   \nMEDIA," +
                        "   \nGRAVE, " +
                        "   \nMUITO_GRAVE :");
                try {
                    InfracaoCategoria cat = InfracaoCategoria.valueOf(scanner.nextLine().toUpperCase());
                    infracao.setInfracaoCategoria(cat);
                    categoriaValida = true;
                } catch (Exception e) {
                    System.out.println("Categoria invalida! Tente novamente.");
                }
            }

            // Valor da multa
            boolean multaValida = false;
            while (!multaValida) {
                System.out.println("Digite o valor da multa:");
                int valor = Integer.parseInt(scanner.nextLine());
                int multaAntes = infracao.getMulta();
                infracao.setMulta(valor);
                if (infracao.getMulta() != multaAntes) { // só muda se foi válido
                    multaValida = true;
                }
            }

            // Associar infração ao condutor
            condutor.adicionarInfrcacao(infracao);
        }

        // Mostrar detalhes
        System.out.println("\n===== DADOS DO CONDUTOR =====");
        condutor.mostrarDetalhes();
    }
}
