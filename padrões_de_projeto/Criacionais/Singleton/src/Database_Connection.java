public class Database_Connection {

    private static Database_Connection _connection;
    public static Database_Connection get_connection(){
        if (_connection == null) {
            _connection = new Database_Connection();
            System.out.println("Nova Conexão Criada");
        }
        else
        {
            System.out.print("Já existe uma conexão");
        }
        return _connection;

    }
}
