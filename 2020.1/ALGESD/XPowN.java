import javax.swing.JOptionPane;
public class XPowN{

   void pow (int base, int power){
      if (power == 0)
         return base;   
      else
         return base * pow(base, power-1);
   }
   
   public static void main (String [] args){
      //Entrada
      int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser elevado:"));
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o elevador:"));
      string result;
      
      //Processamento & Saída
      result = 
      JOptionPane.showMessageDialog(null, String.format("O resultado da elevação de %d  a %d é" + result, x, n));
   
   }
}