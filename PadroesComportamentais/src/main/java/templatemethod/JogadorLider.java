package templatemethod;

public class JogadorLider extends Jogador{

    public String getPatenteJogador() {
        return "Lider";
    }

    @Override
    public String nivelVida() {
        if(this.getVida() >= 80){
            return "Otimo";
        }else if(this.getVida() >= 50 && this.getVida() < 80){
            return "Bom";
        }else if(this.getVida() >= 25 && this.getVida() < 50){
            return "Ruim";
        }else{
            return "Critico";
        }
    }
}
