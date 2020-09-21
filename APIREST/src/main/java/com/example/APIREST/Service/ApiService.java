package com.example.APIREST.Service;

import com.example.APIREST.Domain.ApiDomain;
import com.example.APIREST.Repository.ApiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    private static final Logger logger = LoggerFactory.getLogger(ApiService.class);

    @Autowired
    private ApiRepository ApiRepository;

    public ApiDomain createApiDomain(ApiDomain usuario) {
        return ApiRepository.save(usuario);
    }

    public ApiDomain getApidomain(String name) {
        try {
            return ApiRepository.findByName(name);
        }
        catch (Exception e) {
            logger.error("fails attempting get a usuario", e);
        }

        return null;
    }
}
