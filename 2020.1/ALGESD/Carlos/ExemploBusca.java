public class ExemploBusca {
    
    public static int buscaLinearRecursiva(int vet[ ], int procurado, int inicio)
        {	if(inicio >= vet.length) 
                return -1; //não existe
            else if(vet[inicio] == procurado)
                return inicio;
            else
                return buscaLinearRecursiva(vet, procurado, inicio+1);
   	}

    private static int buscaLinearIterativa (){
        {	
            for(int i=0; i<vet.length; i++)
               {	
                   if(vet[i] == procurado)
                   {	return i;
                   }
               }
            
            return -1;
          }
    }
    public static void main(String[] args) {
        


    }
}