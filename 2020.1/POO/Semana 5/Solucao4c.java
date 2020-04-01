public class Solucao4c{

    public static boolean ehPositivo (int numero){
        if (numero > 0)
            return true;
        else
            return false;
    }

    public static double comRecursividade (double media){
           double numero = Integer.parseInt(
                javax.swing.JOptionPane.showInputDialog(
                    "Digite qualquer número:"));
        if (numero > 0)
            return comRecursividade(media += numero);
        else
            return media/2;
    }
    public static void main (String[] args){

        double media = 0;
        

        javax.swing.JOptionPane.showMessageDialog(null, String.format("O resultado da media é: %f",comRecursividade(media)));

        

    }
}