package com.example.APIREST.Repository;

import com.example.APIREST.Domain.ApiDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApiRepository extends MongoRepository<ApiDomain, String> {

    public ApiDomain findByName(String name);

}
