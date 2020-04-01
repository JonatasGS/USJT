import javax.swing.JOptionPane;

public class TesteTurma {

    public static void main (String[] args){

        String nome = JOptionPane.showInputDialog ("Digite o nome: ");

        String curso = JOptionPane.showInputDialog ("Digite o curso: ");

        int quantidadeDeAlunos = Integer.parseInt (
                JOptionPane.showInputDialog ("Digite a quantidade de Aluno"));
        
        int serie = Integer.parseInt (
                JOptionPane.showInputDialog ("Digite a serie"));
        
        
        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);


        turma.dados();


        turma.setQuantidadeDeAlunos(
            Integer.parseInt(
                JOptionPane.showInputDialog("Atualize a quantidade de alunos")
            )
        );

        turma.dados();



        
    } 
    
}