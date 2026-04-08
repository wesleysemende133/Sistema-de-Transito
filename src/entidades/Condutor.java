package entidades;

import enums.CategoriaCarta;
import infracoes.Infracao;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public  class Condutor extends Pessoa {
    private String numeroBI;
    private String numeroCarta;
    private CategoriaCarta categoriaCarta;
    private List<Infracao> infracoes = new ArrayList<>();

    public Condutor(String nome, String telefone){
        super(nome, telefone);
    }

    /// Metodo para mostrar detalhes
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome do condutor: " + getNome());
        System.out.println("Contacto: " + getTelefone());
        System.out.println("Categoria da carta: " + categoriaCarta);
        System.out.println("Infrações:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        for (Infracao i : infracoes) { // aqui era 'infracoes' mas a lista é 'infracao'
            String dataFormatada = (i.getDataEmissao() != null)
                    ? i.getDataEmissao().format(formatter)
                    : "N/A";
            String descricao = (i.getDescricaoMulta() != null) ? i.getDescricaoMulta() : "N/A";

            System.out.println("- " + i.getInfracaoCategoria());
            System.out.println("Multa: " + i.getMulta() +" MT");
            System.out.println("Data: " + dataFormatada);
            System.out.println("Descrição: " + descricao);
        }
    }

    public String getNumeroBI() {
        return numeroBI;
    }

    public void setNumeroBI(String numeroBI) {
        this.numeroBI = numeroBI;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public CategoriaCarta getCategoriaCarta(){
        return categoriaCarta;
    }

    public void setCategoriaCarta(CategoriaCarta categoriaCarta){
        this.categoriaCarta =categoriaCarta;
    }

    public List<Infracao> getInfracao() {
        return infracoes;
    }

    public void adicionarInfrcacao(Infracao infracao) {
        this.infracoes.add(infracao);
    }
}