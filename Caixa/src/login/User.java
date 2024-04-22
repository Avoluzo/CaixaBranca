
package login;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class User {

	    public Connection conectarBD() {
	        Connection conn = null;

	        try {
	            Class.forName("com.mysql.Driver.Manager").newInstance();
	            String url = "jdbc:mysql://localhost:3306/teste?user=root&password=12345";
	            conn = DriverManager.getConnection(url);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return conn;
	    }

	    public String nome = "";
	    public boolean result = false;

	    public boolean verificarUsuario(String login, String senha) {
	        String sql = "";

	        Connection conn = conectarBD();

	        // INSTRUÇÃO SQL
	        sql += "SELECT nome FROM usuarios ";
	        sql += "WHERE login = '" + login + "' ";
	        sql += "AND senha = '" + senha + "' ";

	        try {
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);

	            if (rs.next()) {
	                result = true;
	                nome = rs.getString("nome");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        return result;
	    }
	}


