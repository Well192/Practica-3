package Solid.DIP;

class InterfazUsuario  {

    private BaseDatos baseDatosOracle, baseDatosMysql;

    public InterfazUsuario(OracleDatabase oracleDatabase){
        this.baseDatosOracle = oracleDatabase;
    }

    public InterfazUsuario(MySQLDatabase mySQLDatabase){
        this.baseDatosMysql = mySQLDatabase;
    }
   public void saveEmployeeIdInMySQL(String empId) {

        baseDatosMysql.saveEmpIdInDatabase(empId);

    }
    public void setDataBaseMySql(MySQLDatabase mySQLDatabase){

        this.baseDatosMysql = mySQLDatabase;

    }
    public void setDataBaseOracle(OracleDatabase oracleDatabase){

        this.baseDatosOracle = oracleDatabase;

    }
    public void saveEmployeeIdInOracle(String empId) {

        baseDatosOracle.saveEmpIdInDatabase(empId);

    }
}
