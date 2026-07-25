public class Conta implements OperacoesBancarias {
String nome;
int conta;
int cpf;
String senha;
double saldo;


    public Conta(String nome, int conta , int cpf , String senha , double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.conta = cpf;
        this.senha = senha;
        this.saldo = saldo;

    }
@Override
    public void sacar(double valor)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");
        }
        saldo -= valor;

    };
@Override
public void depositar(double valor, Conta contadestino)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");

        }
        if (contadestino == null) {
            System.out.println("A Conta destino não existe!!");
        }

        saldo -=valor;
        contadestino+=valor;
    };
    @Override
    public void transferir(double valor, Conta contatransferencia)throws Exception{
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

