import javax.swing.JOptionPane;
public class Solucao3c {

   public static void main (String[] args){
   
      int num = Integer.parseInt(
         JOptionPane.showInputDialog("Digite um número inteiro qualquer, diferente de 0: ")
      );
         
      JOptionPane.showMessageDialog(null, num < 1 ?  "Número elevado ao quadrado: " + (Math.pow(num, 2)):
        "Raiz quadrada do número: " + (Math.pow(num, 0.5))
      );     
   
   }
}