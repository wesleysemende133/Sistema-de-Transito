package entidades;

public class AgenteTransito extends Pessoa{
    public AgenteTransito(String nome, String telefone){
        super(nome,telefone);
    }

    /// Metodo para mostrar detalhes
    @Override
    public void mostrarDetalhes(){
        System.out.println("Nome do Agente: " + getNome());
        System.out.println("Contacto: " + getTelefone());
    }
}
