package templatemethod;

public class JogadorComum extends Jogador{

    public String getPatenteJogador() {
        return "subordinado";
    }

    @Override
    public String nivelVida() {
        if(this.getVida() >= 60){
            return "Otimo";
        }else if(this.getVida() >= 30 && this.getVida() < 60){
            return "Bom";
        }else if(this.getVida() >= 15 && this.getVida() < 30){
            return "Ruim";
        }else{
            return "Critico";
        }
    }
}
