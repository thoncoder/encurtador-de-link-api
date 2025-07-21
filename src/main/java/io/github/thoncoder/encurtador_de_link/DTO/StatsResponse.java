package io.github.thoncoder.encurtador_de_link.DTO;

import java.time.LocalDateTime;

public class StatsResponse {
    private String code;
    private String originalUrl;
    private Integer visitas;
    private LocalDateTime createdAt;

    public StatsResponse (String code, String originalUrl, Integer visitas, LocalDateTime createdAt) {
        this.code = code;
        this.originalUrl = originalUrl;
        this.visitas = visitas;
        this.createdAt = createdAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
