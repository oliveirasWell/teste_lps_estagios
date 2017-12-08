package teste_lps_estagios;

import lombok.AllArgsConstructor;
import negocio.Orientador;
import persistencia.OrientadorCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@AllArgsConstructor
public class NovoOrientadorCRUD extends OrientadorCRUD {

    public String cadastrar(NovoOrientador novoOrientador) {
        try {

            Connection conn = ConexaoBanco.connectar();

            String INSERT = "INSERT INTO orientador(nome, perfil, usuario, senha, email, especialidade)VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(INSERT);
            stmt.setString(1, novoOrientador.getNome());
            stmt.setString(2, novoOrientador.getPerfil());
            stmt.setString(3, novoOrientador.getUsuario());
            stmt.setString(4, novoOrientador.getSenha());
            stmt.setString(5, novoOrientador.getEmail());
            stmt.setString(6, novoOrientador.getEspecialidade());
            stmt.setString(6, novoOrientador.getTitulacao());
            stmt.executeUpdate();

            System.out.println("Cadastro efetuado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Não cadastrado! " + ex);
        }
        return null;
    }

    public ArrayList<Orientador> exibir() {
        String select = "SELECT * FROM orientador";

        ArrayList<Orientador> orientadores = new ArrayList<>();

        PreparedStatement stmt;

        Connection conn = ConexaoBanco.connectar();

        try {
            stmt = conn.prepareStatement(select);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                NovoOrientador novoOrientador = new NovoOrientador();
                novoOrientador.setNome((rs.getString("nome")));
                orientadores.add(novoOrientador);
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }

        return orientadores;
    }


}
