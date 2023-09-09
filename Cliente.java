package fatecfranca.lista02;


public class Cliente {
   
    // instânciação das variaveis 
    private String numeroConta, numeroAgencia,nome;
    private float saldo;
    
    // método construtor sem argumento
    public Cliente(){
        
    }
    // método construtor com valores de argumentos 
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        
        this.setnumeroConta(numeroConta);
        this.setnumeroAgencia(numeroAgencia);
        this.setnome(nome);
        this.setsaldo(saldo);
        
    }
    
    // métodos setters e getters da variavel numeroConta
    public String getnumeroConta() {
        return numeroConta;
    }

    public final void setnumeroConta(String numeroConta) {
        
        if (numeroConta.length()== 8 && numeroConta.charAt(6) == '-'){
            
            this.numeroConta = numeroConta;
        }
        else{
            this.numeroConta = "";
            System.out.println("Informe um número de conta valido de 8 digitos!");
        } 
    }

    // método setter e getters da variavel numeroAgência
    public String getnumeroAgencia() {
        return numeroAgencia;
    }

    public final void setnumeroAgencia(String numeroAgencia) {
        
        if (numeroAgencia.length()==6 && numeroAgencia.charAt(4)=='-'){
            
            this.numeroAgencia = numeroAgencia;
        }
        else{
            this.numeroAgencia = "";
            System.out.println("Informe um número de agência valido de 6 digitos!");
        }
        
    }

    // método setters e getters da váriavel nome
    public String getnome() {
        return nome;
    }

    public final void setnome(String nome) {
        
        if (nome.length() <= 30){
            
            this.nome=nome;
        } 
        else{
            this.nome = "";
            System.out.println("Nome informado inválido!");
        }
        
    }

    // método para a operação Saldo
    public float getsaldo() {
        return saldo;
    }

    public final void setsaldo(float saldo) {
        
        if (saldo <0){
            
            System.out.println("Saldo inválido!");
        }else{
            
            this.saldo = saldo;
        }
        
    }
    
    // método para o a realização do deposito
    public void realizarDeposito(float x){
        
        this.setsaldo(this.saldo + x); // usamos o método set saldo para cuidar da variavel saldo
    }
    
    // método para a realização do saque
    public void realizarSaque(float x){
        
       this.setsaldo(this.saldo - x); // utilizamos o método set saldo para cuidar da variavel saldo
    }
    
    // método para a exibição do extrato

    @Override
    public String toString() {
        return   """
                     \n======= Extrato =======
                      Número Conta=  """ +  numeroConta + "\n Numero Agência= " + numeroAgencia + 
                     "\n Nome= " + nome + "\n Saldo= " + saldo;
    }


}





