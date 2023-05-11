public class Main {
    public static void main(String[] args) {

        System.out.println("***Singleton Pattern Demo***\n");


        System.out.println("Tentativa de criação de uma nova conexão");
        Database_Connection conexao1 = Database_Connection.get_connection();


        System.out.println("Tentando criar uma nova conexão");
        Database_Connection conexao2 = Database_Connection.get_connection();

        if (conexao1 == conexao2)
        {
            System.out.println("as duas conexões são a mesma");
        }



    }
}