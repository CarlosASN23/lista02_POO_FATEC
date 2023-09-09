package fatecfranca.lista02;

public class TesteAluno {
    
    public static void main(String[] args){
        
        
        // Instaciação da classe Aluno  e chamada dos métodos nota final e dados do Aluno
        Aluno aluno01 = new Aluno("Ricardo Alcantra Nassau",999232,22,7.75f,9.88f);
        aluno01.notaFinal();
        System.out.println(aluno01.toString());
        
        Aluno aluno02 = new Aluno();
        aluno02.notaFinal();
        System.out.println(aluno02.toString());
        
 }
}