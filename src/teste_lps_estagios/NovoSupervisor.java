package teste_lps_estagios;

import negocio.Supervisor;

public class NovoSupervisor extends Supervisor {
    private String tempoDeExperiencia;

    public String getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia(String tempoDeExperiencia) {
        this.tempoDeExperiencia = tempoDeExperiencia;
    }
}
