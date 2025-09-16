package com.biblioteca.apibiblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController: Diz ao Spring que esta classe vai receber requisições web.
@RestController
public class StatusController {

    // @GetMapping("/status"): Diz ao Spring que quando alguém acessar a URL "/status",
    // o método logo abaixo deve ser executado.
    @GetMapping("/status")
    public String verStatus() {
        return "A API está online!";
    }
}