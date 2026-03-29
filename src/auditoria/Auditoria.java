package auditoria;

import entidades.Condutor;
import infracoes.Infracao;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Auditoria {

    public static void registrarCondutor(Condutor condutor) {
        // criar nome do ficheiro baseado no nome e contacto
        String nomeArquivo = condutor.getNome().replaceAll("\\s+", "_") + "_" + condutor.getTelefone() + ".txt";

        try (FileWriter fw = new FileWriter(nomeArquivo)) { // sem 'true', sempre cria novo
            fw.write("===== CONDUTOR =====\n");
            fw.write("Nome: " + condutor.getNome() + "\n");
            fw.write("Contacto: " + condutor.getTelefone() + "\n");
            fw.write("Categoria da carta: " + condutor.getCategoriaCarta() + "\n");
            fw.write("Infrações:\n");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            for (Infracao i : condutor.getInfracao()) {
                // segurança caso dataEmissao ou descricao sejam nulos
                String dataFormatada = (i.getDataEmissao() != null)
                        ? i.getDataEmissao().format(formatter)
                        : "N/A";
                String descricao = (i.getDescricaoMulta() != null) ? i.getDescricaoMulta() : "N/A";

                fw.write(" - Categoria: " + i.getInfracaoCategoria() +
                        " | Multa: " + i.getMulta() + " MT" +
                        " | Data: " + dataFormatada +
                        " | Descrição: " + descricao + "\n");
            }

            fw.flush();
            System.out.println("Auditoria do condutor registrada em: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao gravar auditoria: " + e.getMessage());
        }
    }
}