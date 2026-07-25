interface OperacoesBancarias {

    void sacar(double valor) throws Exception;

    void depositar(double valor) throws Exception;

    void depositar(double valor, Conta contadestino)throws Exception;

    void transferir(double valor, Conta contaDestino) throws Exception;



}
