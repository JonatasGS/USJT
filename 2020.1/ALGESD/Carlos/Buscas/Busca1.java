import javax.swing.*;

   public class Busca1
   {
      public static int buscaLinear(int vet[], int procurado)
      {
         for(int i=0; i<vet.length;i++)
         {
            if(vet[i] == procurado)
               return i;
         }
         return -1;
      }
  
      public static void main(String args[])
      {
         int x[]={5, 8, 9, 3, 2, 0, 1, -5, 4};
     
         int proc = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp = buscaLinear(x, proc);
     
         if(resp == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp);
      }
   }