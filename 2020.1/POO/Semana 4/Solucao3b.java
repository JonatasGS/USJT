import javax.swing.JOptionPane;
public class Solucao3b {

   public static void main (String [] args) {
   
      int numA = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o primeiro número:")
         );
         
      int numB = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o segundo número:")
         );
            
      JOptionPane.showMessageDialog(null, 
        (numA + numB) <= 20 ? "Resultado subtraído por cinco: " + (numA + numB - 5):
        "Resultado é maior que vinte: " + (numA + numB)  
      );        
  }
}