package fatecfranca.lista02;

public class Aluno {
    
    // instanciação das variaveis
    private int numeroAluno, idade;
    private float p1, p2;
    private String nome;
    
    // método construtor sem argumento
    public Aluno(){
        
        this.setnome("Ronildo Gonçalves");
        this.setnumeroAluno(887222);
        this.setidade(31);
        this.setp1(9.76f);
        this.setp2(8.76f);
}
    
    // método construtor para inicialização das variaveis 
    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        
        this.setnome(nome);
        this.setnumeroAluno(numeroAluno);
        this.setidade(idade);
        this.setp1(p1);
        this.setp2(p2);
    }
   
    public int getnumeroAluno() {
        return numeroAluno;
    }

    public final void setnumeroAluno(int numeroAluno) {
        
        if (String.valueOf(numeroAluno).length() == 6){
            this.numeroAluno = numeroAluno; 
        }
        else{
            System.out.println("Numero de aluno inválido: Insirá um valor válido de até 6 digitos");
        }
        
    }

    public int getidade() {
        return idade;
    }

    public final void setidade(int idade) {
        this.idade = idade;
    }

    public float getp1() {
        return p1;
    }

    public final void setp1(float p1) {
        
        if (p1<0){
            System.out.println("Insira uma nota válida!");
        }
        else{
            this.p1 = p1;
        }
    }

    public float getp2() {
        return p2;
    }

    public final void setp2(float p2) {
        
        if (p2<0){
            System.out.println("Insira uma nota válida!");
        }
        else{
            this.p2 = p2;
        }      
    }

    public String getnome() {
        return nome;
    }

    public final void setnome(String nome) {
        
        if (nome.length()>30){
            this.nome = "";
            System.out.println("Numero de caracteres extrapolados, reensira o nome");
        }
        else{
            this.nome = nome;
        } 
    }
    
    // método para o calculo da média final do aluno
    public float notaFinal(){
        
      return (this.p1 + this.p2)/2;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               ==== Dados do Aluno ====
                Nome do aluno: """ + nome 
                + "\n Numero do aluno: " + numeroAluno
                + "\n Idade do aluno: " + idade
                + "\n Nota p1: " + p1
                + "\n Nota p2: " + p2
                + "\n Nota final: " + this.notaFinal()
            + "\n======================== ";
    }
    
}
