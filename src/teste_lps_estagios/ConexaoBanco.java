package teste_lps_estagios;

import persistencia.FabricaConexao;

import java.sql.Connection;

public class ConexaoBanco {
    private static String urlBanco = "jdbc:mysql://localhost:3306/teste_lps";
    private static String usuarioBanco = "root";
    private static String SenhaBanco = "root";

    public static Connection connectar(){
        FabricaConexao conexao = new FabricaConexao(urlBanco, usuarioBanco, SenhaBanco);
        return FabricaConexao.conectar();
    }
}
