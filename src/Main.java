//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    System.out.println("---------INFORMAÇÃO DA CONTA-----------");


        Conta dyego = new Conta("Dyego",15530,"40650020302","20530",15.90);

        Conta recrutador = new Conta("Recrutador",56532,"50420251231","23500",10000);

        dyego.info();
        System.out.println("-----------------");
        recrutador.info();


        try {
            System.out.println("---------DEPOSITAR-----------");
            dyego.depositar(20);
            System.out.println("Depositou : 20");
            recrutador.depositar(50);
            System.out.println("Depositou : 50");

            System.out.println("---------SACAR-----------");
            dyego.sacar(5.70);
            recrutador.sacar(692.50);


            System.out.println("---------TRANSFERIR-----------");

            recrutador.transferir(500,dyego);


        }


        catch (Exception e){
            System.out.println(e.getMessage());
        };

        System.out.println("---------INFORMAÇÃO DA CONTA-----------");
        dyego.info();
        System.out.println("-----------------");
        recrutador.info();
    }
}