package fatecfranca.lista02;


public class TestaCliente {

    public static void main(String[] args) {
      
        Cliente p01 = new Cliente("002349-2","2134-8","Thiago Eleno",0f);
        p01.realizarDeposito(500f);
        p01.realizarSaque(175f);
        System.out.println(p01.toString());
        
        Cliente p02 = new Cliente("002349-2","2134-8","José Ferreira",0f);
        p02.realizarDeposito(599f);
        p02.realizarSaque(2f);
        System.out.println(p02.toString());
    }
}
