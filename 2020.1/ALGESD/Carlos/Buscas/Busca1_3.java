import javax.swing.*;

public class Busca1_3 {
    
        public static String buscaLinear(String vet[], String procurado, int currentPos)
        {
  
           if (vet[currentPos].equals(procurado))
              return "O nome foi encontrado no índice: " + Integer.toString(currentPos);
           else if (vet[currentPos].charAt(0) < procurado.charAt(0) ||  currentPos == 0)
              return "Não encontrado";
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
    
        public static void main(String args[]){

            String[] x = {"Abner", "Bruna", "Carlos", "Denis", "Fernanda", "Gabriel", "Hyago", "Jonas", "Thalia"}; //5, 8, 9, 3, 2, 0, 1, -5, 4 
            String proc = JOptionPane.showInputDialog("Qual o nome procurado?");
            
        
            JOptionPane.showMessageDialog(null, buscaLinear(x, proc, x.length - 1));
            
            
        }

}