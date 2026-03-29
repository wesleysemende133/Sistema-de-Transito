package entidades;

import enums.CategoriaCarta;
import infracoes.Infracao;

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
    public void mostrarDetalhes(){
        System.out.println("Nome do condutor" + getNome());
        System.out.println("Contacto: "+ getTelefone());
        System.out.println("Categoria da carta: " + categoriaCarta);
        System.out.println("Infrações:");
        for (Infracao i : infracoes) {
            System.out.println("- " + i.getInfracaoCategoria() +
                    " | Multa: " + i.getMulta() + " MT");
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