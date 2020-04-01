public class Turma {
        
        private String nome, curso;
        private int quantidadeDeAlunos, serie;

        public String getNome (){
            return nome;
        }

        public void setNome (String n){
            nome = n;
        }

        public String getCurso (){
            return curso;
        } 

        public void setCurso (String c){
            curso = c;          
        }

        public int getQuantidadeDeAlunos (){
            return quantidadeDeAlunos;
        }

        public void setQuantidadeDeAlunos (int qntAlunos){
            quantidadeDeAlunos = qntAlunos;
        }

        public int getSerie (){
            return serie;
        }

        public void setSerie (int s){
            serie = s;
        }
        
       public Turma (String nome, String curso, int quantidadeDeAlunos, int serie){
           this.nome = nome;
           this.curso = curso;
           this.quantidadeDeAlunos = quantidadeDeAlunos;
           this.serie = serie;
        }

        public Turma (){

        }

        public void dados (){
            javax.swing.JOptionPane.showMessageDialog(null,
                String.format ("Nome: %s - Curso: %s - Quantidade de Alunos: %d - Serie: %d",
                                    getNome(), 
                                    getCurso(), 
                                    getQuantidadeDeAlunos() , 
                                    getSerie())
            );
        }
            
        
}
    