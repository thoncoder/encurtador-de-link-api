package io.github.thoncoder.encurtador_de_link.DTO;

<<<<<<< HEAD
import java.time.LocalDateTime;

=======
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
public class StatsResponse {
    private String code;
    private String originalUrl;
    private Integer visitas;
<<<<<<< HEAD
    private LocalDateTime createdAt;

    public StatsResponse (String code, String originalUrl, Integer visitas, LocalDateTime createdAt) {
        this.code = code;
        this.originalUrl = originalUrl;
        this.visitas = visitas;
        this.createdAt = createdAt;
=======

    public StatsResponse (String code, String originalUrl, Integer visitas) {
        this.code = code;
        this.originalUrl = originalUrl;
        this.visitas = visitas;
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
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
<<<<<<< HEAD

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
=======
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
}
