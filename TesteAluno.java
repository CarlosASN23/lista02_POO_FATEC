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
        
        /* 
        Ao tentarmos acessar as variaveis de instância da classe Aluno
        sem os métodos get e set o sistema não deixa por ser variaveis
        de acesso privados.
        
        Aluno aluno03 = new Aluno();
        aluno03.numeroAluno = 009222;
        aluno03.idade = 23;
        aluno03.nome = "João Gustavo";
        aluno03.p1 = 7.55f;
        aluno03.p2 = 6.88f;
        */ 
 }
}