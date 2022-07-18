package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");

        InterfazUsuario usuario = new InterfazUsuario(new OracleDatabase());
        InterfazUsuario usuario2 = new InterfazUsuario(new MySQLDatabase());

        // Usando Oracle  (guardando ID del empleado en la base de datos ORACLE)

        usuario.saveEmployeeIdInOracle("E001");

        // Usando Mysql (guardando ID del empleado en la base de datos MYSQL)

        usuario2.saveEmployeeIdInMySQL("E002");

        // Cambiando la base de datos objetivo (este usuario ya ha sido guardado en la base de datos ORACLE
        // Y ahora se está guardando en la base de datos MYSQL).

       // usuario = new InterfazUsuario(new MySQLDatabase());
        usuario.setDataBaseMySql(new MySQLDatabase());

        usuario.saveEmployeeIdInMySQL("E001");

    }
}
