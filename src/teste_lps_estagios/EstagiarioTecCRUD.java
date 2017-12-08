package teste_lps_estagios;

import persistencia.EstagiariotCRUD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstagiarioTecCRUD extends EstagiariotCRUD {

    public String cadastrar(NovoEstagiarioTecnico estagiario) {
        PreparedStatement stmt;

        Date objdat = Date.valueOf(estagiario.getDataNascimento());

        try {

            Connection conn = ConexaoBanco.connectar();

            String INSERT = "INSERT INTO estagiariotecnico(nome, perfil, usuario, senha, email, datanascimento, cpf, identidade, orgaoexpedidor, endereco, numero, bairro, cep, cidade, estado, celular, telefonefixo, curso, semestreatual, nomeresponsavel, codigoemac)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            stmt = conn.prepareStatement(INSERT);

            stmt.setString(1, estagiario.getNome());
            stmt.setString(2, estagiario.getPerfil());
            stmt.setString(3, estagiario.getUsuario());
            stmt.setString(4, estagiario.getSenha());
            stmt.setString(5, estagiario.getEmail());
            stmt.setDate(6, objdat);
            stmt.setString(7, estagiario.getCpf());
            stmt.setString(8, estagiario.getIdentidade());
            stmt.setString(9, estagiario.getOrgaoExpedidor());
            stmt.setString(10, estagiario.getEndereco());
            stmt.setInt(11, estagiario.getNumero());
            stmt.setString(12, estagiario.getBairro());
            stmt.setString(13, estagiario.getCep());
            stmt.setString(14, estagiario.getCidade());
            stmt.setString(15, estagiario.getEstado());
            stmt.setString(16, estagiario.getCelular());
            stmt.setString(17, estagiario.getTelefoneFixo());
            stmt.setString(18, estagiario.getCurso());
            stmt.setString(19, estagiario.getSemestreAtual());
            stmt.setString(20, estagiario.getNomeResponsavel());
            stmt.setString(21, estagiario.getCodigoEMac());

            stmt.executeUpdate();

            System.out.println("Cadastro efetuado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Não cadastrado! " + ex);
        }
        return null;
    }



}
