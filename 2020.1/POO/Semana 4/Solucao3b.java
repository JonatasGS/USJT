import javax.swing.JOptionPane;
public class Solucao3b {

   public static void main (String [] args) {
   
      int numA = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o primeiro n�mero:")
         );
         
      int numB = Integer.parseInt(
         JOptionPane.showInputDialog("Digite o segundo n�mero:")
         );
            
      JOptionPane.showMessageDialog(null, 
        (numA + numB) <= 20 ? "Resultado subtra�do por cinco: " + (numA + numB - 5):
        "Resultado � maior que vinte: " + (numA + numB)  
      );        
  }
}