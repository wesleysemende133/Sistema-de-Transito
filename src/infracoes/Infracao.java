package infracoes;

import enums.InfracaoCategoria;

import java.time.LocalDateTime;

public class Infracao {
    private InfracaoCategoria infracaoCategoria;
    private  int multa;
    private LocalDateTime dataEmissao;

    public InfracaoCategoria getInfracaoCategoria() {
        return infracaoCategoria;
    }

    public void setInfracaoCategoria(InfracaoCategoria infracaoCategoria) {
        this.infracaoCategoria = infracaoCategoria;

        System.out.println("Categoria definida: " + infracaoCategoria);
    }
    public int getMulta(){
        return multa;
    }
    public void setMulta(int multa) {
        if (infracaoCategoria == null) {
            System.out.println("Defina primeiro a categoria da infração!");
            return;
        }

        boolean valido = false;

        switch (infracaoCategoria) {
            case LEVE -> valido = multa >= 1000 && multa <= 3000;
            case MEDIA -> valido = multa >= 3001 && multa <= 7000;
            case GRAVE -> valido = multa >= 7001 && multa <= 15000;
            case MUITO_GRAVE -> valido = multa >= 15001 && multa <= 50000;
        }
        if (valido) {
            this.multa = multa;
            System.out.println("Multa definida: " + multa + " MT");
            System.out.println("Data de emissão: " + dataEmissao);
        } else {
            System.out.println("Erro: valor da multa inválido para a categoria " + infracaoCategoria);
        }
    }
    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }
}
