import javax.swing.*;

   public class Busca1_2
   {
      public static int buscaLinear(int vet[], int procurado, int currentPos)
      {

         if (vet[currentPos] == procurado)
            return currentPos;
         else if (vet[currentPos] < procurado ||  currentPos == 0)
            return -1;
         else{
            return buscaLinear(vet, procurado, currentPos-1);
         }


         //for(int i=0; i<vet.length;i++)
         //{
         //   if(vet[i] == procurado)
         //      return i;
         //}
         //return -1;
      }
  
      public static void main(String args[])
      {
         int x[]={-5, 0, 1, 2, 3, 4, 5, 8, 9 }; //5, 8, 9, 3, 2, 0, 1, -5, 4 
     
         int proc = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));
         int resp = buscaLinear(x, proc, x.length-1);
     
         if(resp == -1)
            JOptionPane.showMessageDialog(null, "Não existe no vetor");
         else
            JOptionPane.showMessageDialog(null, "Está no índice " + resp);
      }
   }