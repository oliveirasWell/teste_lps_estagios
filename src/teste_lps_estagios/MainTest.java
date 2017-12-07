package teste_lps_estagios;

import java.time.LocalDate;

public class MainTest {


    public static void main(String[] args) {

        ConexaoBanco.connectar();

        EstagiarioTecCRUD estagiarioTecCRUD = new EstagiarioTecCRUD();

        EstagiarioTec estagiario = new EstagiarioTec("20");

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

    }
}
