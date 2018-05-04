package SistemadeApoioDecisao;

/**
 *
 * @author rodri
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLServerConnection {
    static final String banco = "jdbc:sqlserver://localhost:1433\\SQLEXPRESS;databaseName=MineralRequirements";
    Connection conexao = null;
    ResultSet resultados = null;
    PreparedStatement minhaconsulta = null;
    Statement statement = null;
    
    public void consultar(int Cod_Plant){
        
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conexao = DriverManager.getConnection(banco,"","");
            statement = conexao.createStatement();
            minhaconsulta = conexao.prepareStatement("select Nome_Plant from Mineral where Cod_Plant = ? ");
            minhaconsulta.setInt(1,Cod_Plant);
            
            resultados = minhaconsulta.executeQuery();
            ResultSetMetaData colunas = resultados.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            
            while (resultados.next()){
                for (int i = 1; i <= numeroColunas; i++)
                    JOptionPane.showMessageDialog(null, "dados da planta " + resultados.getObject(i));
            }
        }
        catch (Exception erro){
            erro.printStackTrace();
        }
        finally{
            try{
                resultados.close();
                minhaconsulta.close();
                conexao.close();
            }
            catch (Exception erronovo){
                erronovo.printStackTrace();
            }
        }
    }   
}