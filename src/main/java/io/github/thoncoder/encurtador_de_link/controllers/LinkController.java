package io.github.thoncoder.encurtador_de_link.controllers;

import io.github.thoncoder.encurtador_de_link.DTO.EncurtarRequest;
import io.github.thoncoder.encurtador_de_link.DTO.EncurtarResponse;
import io.github.thoncoder.encurtador_de_link.DTO.StatsResponse;
import io.github.thoncoder.encurtador_de_link.entities.LinkEntity;
import io.github.thoncoder.encurtador_de_link.services.LinkService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@Validated
@CrossOrigin(origins = "*")
public class LinkController {

    @Autowired
    private LinkService linkService;

    @Value("${app.url.base}")
    private String urlBase;

    @PostMapping("/encurtar")
    public ResponseEntity<EncurtarResponse> encurtar (@RequestBody @Valid EncurtarRequest request) {
        LinkEntity link = new LinkEntity();
        link.setVisitas(0);
        link.setOriginalUrl(request.getOriginalUrl());
        linkService.criar(link);

        String urlEncurtada = urlBase+link.getCode();
        EncurtarResponse response = new EncurtarResponse(urlEncurtada);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/stats/{code}")
    public ResponseEntity<StatsResponse> getStats (@PathVariable("code") String code) {
        Optional<LinkEntity> link = linkService.getByCode(code);
<<<<<<< HEAD
        StatsResponse response = new StatsResponse(null, null, null, null);;
=======
        StatsResponse response = new StatsResponse(null, null, null);;
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
        if (link.isPresent()) {
            response.setCode(link.get().getCode());
            response.setVisitas(link.get().getVisitas());
            response.setOriginalUrl(link.get().getOriginalUrl());
<<<<<<< HEAD
            response.setCreatedAt(link.get().getCreatedAt());
=======
>>>>>>> 2d9deec4220b2cf97ae6006785a01901646bf061
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{code}")
    public void redirect (@PathVariable String code, HttpServletResponse response) throws IOException {
        Optional<LinkEntity> link = linkService.getByCode(code);
        if (link.isPresent()) {
            linkService.addVisita(link.get());
            response.sendRedirect(link.get().getOriginalUrl());
        }else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}
