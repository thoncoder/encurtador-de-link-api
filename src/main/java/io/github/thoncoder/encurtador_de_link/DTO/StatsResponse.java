package io.github.thoncoder.encurtador_de_link.DTO;

public class StatsResponse {
    private String code;
    private String originalUrl;
    private Integer visitas;

    public StatsResponse (String code, String originalUrl, Integer visitas) {
        this.code = code;
        this.originalUrl = originalUrl;
        this.visitas = visitas;
    }

    public String getCode() {
        return code;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public Integer getVisitas() {
        return visitas;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
