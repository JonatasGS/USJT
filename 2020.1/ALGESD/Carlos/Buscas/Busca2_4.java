public class Busca2_4
{
    public static int buscaLinearModificada (int vet[], int procurado)
    {
        int cont = 1;

        for(int i = 0; i < vet.length; i++)
        {
        if(vet[i] == procurado)
            return cont;
        
        cont++;           
        }
        return -1;
    }
    
    public static int[] buscaLinearMinMax (int vetLength){
        int[] array = {1,vetLength};
        return array;
        
    }
    
    public static int buscaBinariaModificada (int vet[], int procurado){

        int cont = 1;
        int inicio = 0;
        int fim = vet.length - 1;
            
        while(inicio <= fim)
        {
        int meio = (inicio + fim) / 2;
            
        if(vet[meio] == procurado)
            return cont;                    
        else
            if (vet[meio] < procurado)
                inicio = meio + 1;
            else
                fim = meio - 1;
        
            cont++;
        }
        return -1;
    }

    public static int[] buscaBinariaMinMax (int vetLength){
        
        int count = 0;
        
        while (vetLength != 0){
            vetLength = vetLength/2;
            count++;
        }

        int[] array = {1, count};

        return array;
        
    }
    
    public static void main (String args[])
    {
        int vet[] = new int[1000];
        
        for(int i=0; i<1000; i++) vet[i] = i;
        
        int tempoLinear = 0, tempoBinaria = 0, tempoMinLinear, tempoMaxLinear, tempoMinBinaria, tempoMaxBinaria;
        
        for(int i=0; i < 2000; i++)
        {
            int aleatorio = (int) (Math.random()*1000);
            tempoLinear+= buscaLinearModificada(vet, aleatorio);
            tempoBinaria+= buscaBinariaModificada(vet, aleatorio);
            
        }
        
        tempoLinear = tempoLinear/2000;
        tempoBinaria = tempoBinaria/2000;
        tempoMinLinear = buscaLinearMinMax(vet.length)[0];
        tempoMaxLinear = buscaLinearMinMax(vet.length)[1];
        tempoMinBinaria = buscaBinariaMinMax(vet.length)[0];
        tempoMaxBinaria = buscaBinariaMinMax(vet.length)[1];

        System.out.println ("Tempo médio da Busca Linear: " + tempoLinear);
        System.out.println ("Tempo mínimo da Busca Linear: " + tempoMinLinear);
        System.out.println ("Tempo máximo da Busca Linear: " + tempoMaxLinear);
        System.out.println ("Tempo médio da Busca Binária: " + tempoBinaria);
        System.out.println ("Tempo mínimo da Busca Binária: " + tempoMinBinaria);
        System.out.println ("Tempo máximo da Busca Binária: " + tempoBinaria);
    }
}  