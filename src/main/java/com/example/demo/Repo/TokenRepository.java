package com.example.demo.Repo;

import com.example.demo.Entities.TokenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends CrudRepository<TokenEntity, Long> {
    Optional<TokenEntity> findByToken(String token);
    Long deleteByToken(String token);
}