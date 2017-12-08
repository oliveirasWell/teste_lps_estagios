package teste_lps_estagios;

import persistencia.SupervisorCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NovoSupervisorCrud extends SupervisorCRUD {
    public void cadastrar(NovoSupervisor novoSupervisor) {
        try {
            Connection conn = ConexaoBanco.connectar();

            String INSERT = "INSERT INTO supervisor(nome, perfil, usuario, senha, email, formacao, tempodeexperiencia)VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(INSERT);
            stmt.setString(1, novoSupervisor.getNome());
            stmt.setString(2, novoSupervisor.getPerfil());
            stmt.setString(3, novoSupervisor.getUsuario());
            stmt.setString(4, novoSupervisor.getSenha());
            stmt.setString(5, novoSupervisor.getEmail());
            stmt.setString(6, novoSupervisor.getFormacao());
            stmt.setString(7, novoSupervisor.getTempoDeExperiencia());
            stmt.executeUpdate();
            System.out.println("Cadastro efetuado com sucesso!");
        } catch (SQLException var5) {
            System.out.println("Não cadastrado! " + var5);
        }

    }
}
