public class Solucao4b {


    public static void doWhile(int contador){
        System.out.println(contador);
        do
            System.out.println(contador+= 2);
        while (contador < 198);
    }

    public static void comFor(int contador, int repeticao){
        for (int i = repeticao; i <= 100; i++){
            System.out.println (contador);
            contador = contador + 2;           
        }
    }

    public static void comRecursividade(int contador, int repeticao){
        if (repeticao > 100);
        else{
            System.out.println(contador);
            comRecursividade(2+contador, ++repeticao);
        }
    }
    public static void main(String[] args) {
            
            int contador = 0;
            int repeticao = 1;

            doWhile(contador);
            System.out.println("*******");
            comFor(contador, repeticao);
            System.out.println("******");
            comRecursividade(contador, repeticao);           


            
                   
    }
}