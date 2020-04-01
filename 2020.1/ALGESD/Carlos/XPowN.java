import javax.swing.JOptionPane;
public class XPowN{

  static int pow (int base, int power){
      if (power == 0)
         return 1;
      else if (power == 1)
         return base;   
      else
         return base * pow(base, power-1);
   }
   
   public static void main (String [] args){
      //Entrada
      int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser elevado:"));
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o elevador:"));
      String result;
      
      //Processamento & Saída
      result = Integer.toString(pow(x,n));
      JOptionPane.showMessageDialog(null, String.format("O resultado da elevação de %d  a %d é: " + result, x, n));
   
   }
}