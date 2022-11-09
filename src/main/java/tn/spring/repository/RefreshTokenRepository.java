package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.spring.entity.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
