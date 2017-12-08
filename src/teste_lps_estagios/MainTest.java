package teste_lps_estagios;

import persistencia.ConcedenteJuridicaCRUD;

import java.time.LocalDate;

public class MainTest {
    private static String urlBanco = "jdbc:mysql://localhost:3306/teste_lps";
    private static String usuarioBanco = "root";
    private static String SenhaBanco = "root";

    public static void main(String[] args) {

        //Nosso modo
        ConexaoBanco.connectar();

        //Modo deles
//        FabricaConexao conexao = new FabricaConexao(urlBanco, usuarioBanco, SenhaBanco);
//        FabricaConexao.conectar();

        //Concedente
        ConcedenteJuridicaCRUD concedenteJuridicaCRUD = new ConcedenteJuridicaCRUD();


        //Estagiário tecnico
        EstagiarioTecCRUD estagiarioTecCRUD = new EstagiarioTecCRUD();
        NovoEstagiarioTecnico estagiario = new NovoEstagiarioTecnico();
        estagiario.setNome("Wellington");
        estagiario.setPerfil("Perfil");
        estagiario.setUsuario("oliveiraswell");
        estagiario.setSenha("12345678");
        estagiario.setEmail("well.oliveira.snt@gmail.com");
        estagiario.setDataNascimento(LocalDate.now());
        estagiario.setCpf("12345678900");
        estagiario.setIdentidade("123456789");
        estagiario.setOrgaoExpedidor("SSP");
        estagiario.setEndereco("A");
        estagiario.setNumero(12);
        estagiario.setBairro("Teste");
        estagiario.setCep("7900000");
        estagiario.setCidade("CG");
        estagiario.setEstado("MS");
        estagiario.setCelular("4654654654");
        estagiario.setTelefoneFixo("5545454");
        estagiario.setCurso("Teste");
        estagiario.setSemestreAtual("12");
        estagiario.setNomeResponsavel("Nenhum");
        estagiario.setCodigoEMac("456464");
        estagiarioTecCRUD.cadastrar(estagiario);

        //NovoOrientador
        NovoOrientadorCRUD novoOrientadorCRUD = new NovoOrientadorCRUD();
        NovoOrientador orientador = new NovoOrientador();
        orientador.setNome("a");
        orientador.setPerfil("Orientador");
        orientador.setUsuario("");
        orientador.setSenha("a");
        orientador.setEmail("a");
        orientador.setEspecialidade("a");
        novoOrientadorCRUD.cadastrar(orientador);

        //NovoSupervisor
        NovoSupervisor sup = new NovoSupervisor();
        sup.setNome("");
        sup.setPerfil("Supervisor");
        sup.setUsuario("");
        sup.setSenha("");
        sup.setEmail("");
        sup.setFormacao("");
        NovoSupervisorCrud novoSupervisorCrud = new NovoSupervisorCrud();
        novoSupervisorCrud.cadastrar(sup);


        novoOrientadorCRUD.exibir();

    }
}
