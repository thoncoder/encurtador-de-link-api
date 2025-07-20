package io.github.thoncoder.encurtador_de_link.DTO;

public class EncurtarResponse {
    private String urlEncurtada;
    public EncurtarResponse(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }
}
