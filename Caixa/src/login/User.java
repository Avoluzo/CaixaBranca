package login; // Pacote Login, na qual essa classe User, pertence

import java.sql.Connection; // Importe para gerar conexão com banco de dados
import java.sql.DriverManager; // Importe para gerenciamento de driver JDBC
import java.sql.ResultSet; // Importe para administrar os resultados de consulta
import java.sql.Statement; // Importe para facilitar a criação e execução de instruções SQL

public class User {

    /*
     * @return se ocorrer de forma certa, ele irá retornar a conexão
     * */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Chama o driver JDBC
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Define a URL de conexão do banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Tenta se conectar ao banco de dados.
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção em geral
        }
        return conn;
    }

    // Variáveis ​​que armazenam o nome do usuário e o resultado da verificação.
    public String nome = "";
    public boolean result = false;

    /*
     * @param login , login digitado pelo usuário
     * @param senha , senha digitado pelo usuário
     * @return irá retornar as informações da consulta, caso exista usuário cadastrado no banco
     * */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // Crie a consulta SQL para procurar o usuário com as credenciais fornecidas
        sql += "select nome from usuarios ";
        sql += "where login='" + login + "'";
        sql += " and senha = '" + senha + "'";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se existe um resultado na consulta de usuário
            if (rs.next()) {
                result = true;
                // Aloca o nome do usuário encontrado, na variável abaixo
                nome = rs.getString("nome");
            }

        } catch (Exception e) {
            // Tratamento de exceção em geral
        }

        return result;
    } // Fim da classe
}
