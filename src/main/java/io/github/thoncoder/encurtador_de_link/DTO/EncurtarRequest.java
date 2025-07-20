package io.github.thoncoder.encurtador_de_link.DTO;

import jakarta.validation.constraints.NotBlank;

public class EncurtarRequest {
    @NotBlank(message = "Voce precisa adicionar a originalUrl")
    private String originalUrl;

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
