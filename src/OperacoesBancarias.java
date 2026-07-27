interface OperacoesBancarias {

    abstract void sacar(double valor) throws Exception;

    abstract void  depositar(double valor)throws Exception;

    abstract void  transferir(double valor, Conta contaDestino) throws Exception;



}
