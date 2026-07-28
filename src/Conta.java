public class Conta implements OperacoesBancarias {
private String nome;
private int conta;
private String cpf;
private String senha;
private double saldo;


    public Conta(String nome, int conta , String cpf , String senha , double saldo) {

        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF deve ter exatamente 11 números");
        }

        if (!senha.matches("\\d{5}")) {
            throw new IllegalArgumentException("Senha deve ter exatamente 5 números");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
        this.senha = senha;
        this.saldo = saldo;

    };
@Override
public void sacar(double valor)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");
        }
        saldo -= valor;

    };
@Override
public void depositar(double valor)throws Exception{



        if ( valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");

        }

        saldo +=valor;
    };
    @Override
    public void transferir(double valor, Conta contatransferencia)throws Exception{
        if (valor>saldo || valor ==0 || valor<0){
            throw new Exception("Digite um valor valido");

        }
        if (contatransferencia == null) {
            throw new Exception("A Conta que deseja tranferir não existe!!");
        }

        saldo -=valor;
        contatransferencia.saldo+=valor;
    };
    void info(){
        System.out.println("Nome do Dono : " +nome);
        System.out.println("Saldo da Conta : " +saldo);
        System.out.println("Numero da conta : " +conta);

    };









}

