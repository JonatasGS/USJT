import javax.swing.JOptionPane;
public class MDC{

    static int checarMaior (int num1, int num2){
        if (num1 >= num2)
            return calcularMDC(num1, num2); 
        else 
            return calcularMDC(num2, num1);
    }

    static int calcularMDC (int num1, int num2){
            if (num1 % num2 == 0)
                return num2;
            else
                return calcularMDC(num2, num1%num2);       
    }
    
    public static void main (String [] args){
        //Variaveis
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número"));

        //Chamando a função
        JOptionPane.showMessageDialog(null, 
            String.format("O MDC entre os números é %d",
                checarMaior(num1, num2)
            )
        );        

        
    }
}