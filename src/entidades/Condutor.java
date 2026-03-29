public  class Condutor extends Pessoa{
    private String numeroBI;
    private String numeroCarta;

    public Condutor(String nome, String telefone){
        super(nome, telefone);
    }

    public enum categoriaCarta{
     LIGEIRO,
     PESADO,
     PROFISSIONAL,
     TRANSPORTES_PUBLICOS
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
}