package teste_lps_estagios;

import lombok.Builder;
import negocio.EstagiarioTecnico;

@Builder
public class EstagiarioTec extends EstagiarioTecnico {

    private String codigoEMac;

    public String getCodigoEMac() {
        return codigoEMac;
    }

    public void setCodigoEMac(String codigoEMac) {
        this.codigoEMac = codigoEMac;
    }
}
