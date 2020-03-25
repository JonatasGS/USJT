import javax.swing.JOptionPane;
public class Solucao3a {
   public static void main (String [] args){
      int numA = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o primeiro número da soma: ")
         );
         
      int numB = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o segundo número da soma: ")
         );
      
      JOptionPane.showMessageDialog(null, numA + numB > 10 ? 
         "Soma é igual a " + (numA + numB) : "Resultado da soma menor ou igual a dez.");
   }
}
