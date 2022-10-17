package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.entity.Logement;

import java.util.Optional;

public interface LogementRepository extends JpaRepository<Logement, Integer> {
    void deleteArticleById(int article_id);
    Optional<Logement> findById(Integer id);
}
