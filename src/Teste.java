
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws Exception {
        Dinossauro Skeep = new Dinossauro();
        // Scanner scan = new Scanner(System.in);
        do {
            Skeep.mostrarAtributos();
            String textoMaiusculo = JOptionPane
                    .showInputDialog("ATIVIDADES COM O SKEEP: \n" + "(P)ular" + "\n" + "co(R)rer" + "\n" + "(C)omer"
                            + "\n" + "(B)rincar" + "\n" + "Tomar (S)ol" + "\n" + "Ficar na S(O)mbra");
            textoMaiusculo = textoMaiusculo.toUpperCase();
            // String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);
            switch (letra) {
            case 'P':
                Skeep.pular();
                break;
            case 'R':
                Skeep.correr();
                break;
            case 'C':
                Skeep.comer();
                break;
            case 'B':
                Skeep.brincar();
                break;
            case 'S':
                Skeep.tomarSol();
                break;
            case 'O':
                Skeep.ficarNaSombra();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Isso o Skeep não consegue fazer!");
                break;
            }
        } while (Skeep.vida == true);
        // scan.close();
    }
}
