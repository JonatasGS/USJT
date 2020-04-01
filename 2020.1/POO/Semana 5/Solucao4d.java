class Solucao4d {
    public static void main(String[] args) {
        
        int numero;
        int contagem = 0;
        
        while (true){
            
            numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite um número: "));
        
            if (numero == 0)
                break;
            else if (numero >= 100 && numero <= 200)
                contagem++;

        }
        
        javax.swing.JOptionPane.showMessageDialog(null, String.format("A quantidade de números entre 100 e 200 - inclusive - é: %d", contagem));

    }
}