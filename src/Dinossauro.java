import javax.swing.JOptionPane;

public class Dinossauro {

    private int energia;
    private int velocidade;
    private int temperatura;
    private int humor;
    public boolean vida = true;

    public void pular() {
        if (energia <= 0) {
            JOptionPane.showMessageDialog(null, "Não posso pular agora, estou sem energia");
        } else if (energia >= 1) {
            energia--;
            humor++;
            JOptionPane.showMessageDialog(null, "Pulei");
        }
    }

    public void correr() {
        if (energia <= 0) {
            JOptionPane.showMessageDialog(null, "Não posso correr agora, estou sem energia");
        } else if (energia >= 1) {
            energia--;
            humor++;
            JOptionPane.showMessageDialog(null, "Corri");
        }
    }

    public void comer() {
        energia++;
        humor++;
        JOptionPane.showMessageDialog(null, "Comi");
    }

    public void brincar() {
        if (energia <= 0) {
            JOptionPane.showMessageDialog(null, "Não posso brincar agora, estou sem energia");
        } else if (energia >= 1) {
            energia--;
            humor++;
            JOptionPane.showMessageDialog(null, "Brinquei");
        }
    }

    public void tomarSol() {
        if (energia <= 0) {
            JOptionPane.showMessageDialog(null, "Não posso tomar sol agora, estou sem energia");
        } else if (energia >= 1) {
            velocidade++;
            energia--;
            humor++;
            JOptionPane.showMessageDialog(null, "Tomei sol");
        }
    }

    public void ficarNaSombra() {
        if (humor <= 0) {
            JOptionPane.showMessageDialog(null, "Não posso ficar na sombra agora, estou muito triste");
        } else if (humor >= 1) {
            energia++;
            humor--;
            JOptionPane.showMessageDialog(null, "Fiquei na sombra");
        }
    }

    public void mostrarAtributos() {
        JOptionPane.showMessageDialog(null, "ATRIBUTOS DO SKEEP: \n" + "Energia = " + energia + "\n" + "Velocidade = "
                + velocidade + "\n" + "Temperatura = " + temperatura + "\n" + "Humor = " + humor);
    }

    public boolean getVida(){
        return vida;
    }

    public void setVida(boolean valor){
        this.vida = valor;
    }

}
