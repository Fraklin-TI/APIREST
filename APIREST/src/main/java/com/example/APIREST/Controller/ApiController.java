package com.example.APIREST.Controller;

import com.example.APIREST.Domain.ApiDomain;
import com.example.APIREST.Service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("usuario")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private ApiService usuarioService;

    @PostMapping
    public void createApiDomain(@RequestBody @Valid ApiDomain usuario) {
        logger.info("saving new usuario");

        try {
            usuarioService.createApiDomain(usuario);
        } catch (DuplicateKeyException e) {
            logger.error(e.getLocalizedMessage());
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getLocalizedMessage());
        } catch (Exception e) {
            logger.error("fails attempting create a usuario", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }

    }

    @GetMapping
    public ApiDomain getApiDomain(@RequestParam String name) {
        logger.info("Find for {} usuario", name);

        ApiDomain usuario;
        try {
            usuario = usuarioService.getApidomain(name);
        } catch (Exception e) {
            logger.error("fails attempting get a saiyajin", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }

        return usuario;
    }

}
