import javax.swing.JOptionPane;
public class Solucao3a {
   public static void main (String [] args){
      int numA = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o primeiro n�mero da soma: ")
         );
         
      int numB = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o segundo n�mero da soma: ")
         );
      
      JOptionPane.showMessageDialog(null, numA + numB > 10 ? 
         "Soma � igual a " + (numA + numB) : "Resultado da soma menor ou igual a dez.");
   }
}
