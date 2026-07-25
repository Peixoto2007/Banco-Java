public abstract class Banco  {

    void sacar(double valor)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");
        }
    saldo -= valor;

    };

    void depositar(double valor, Conta contadestino)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");
            
        }
        if (contadestino == null) {
            System.out.println("A Conta destino não existe!!");
        }

        saldo -=valor;
        contadestino+=valor;
    };

    void transferir(double valor, Conta contatransferencia)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");

        }
        if (contatransferencia == null) {
            System.out.println("A Conta que deseja tranferir não existe!!");
        }

        saldo -=valor;
        contatransferencia+=valor;
    };

}
