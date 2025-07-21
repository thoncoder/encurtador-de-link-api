package io.github.thoncoder.encurtador_de_link.entities;

import jakarta.persistence.*;
<<<<<<< HEAD
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
=======
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061

@Entity
@Table(name="links")
public class LinkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String originalUrl;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private Integer visitas;

<<<<<<< HEAD
    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

=======
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
    public Long getId() {
        return id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getCode() {
        return code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    public Integer getVisitas() {
        return visitas;
    }
}
