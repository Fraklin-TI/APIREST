package com.example.APIREST;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.APIREST.Domain.ApiDomain;
import com.example.APIREST.Service.ApiService;

@SpringBootTest
public class ApirestApplicationTests {

    @Autowired
    private ApiService usuarioService; 

    @Test
    public void saveApiDomain(){
        ApiDomain usuario = new ApiDomain();{
        usuario.setName("Franklin");
        String login = null;
		usuario.setLogin(login);;
        usuario.setSenha(3838);
        Set<String> administrador = null;
		usuario.setAdministrador(administrador);
        

        usuarioService.createApiDomain(usuario);

        ApiDomain usuarioB = usuarioService.getApidomain(usuario.getName());

        Assert.assertEquals(usuario.getName(), usuarioB.getName());
        Assert.assertEquals(usuario.getSenha(), usuarioB.getSenha());
        Assert.assertEquals(usuario.getLogin(), usuarioB.getLogin());
        Assert.assertEquals(usuario.getAdministrador(), usuarioB.getAdministrador());
    }
  }
}