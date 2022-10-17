package tn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.spring.entity.Logement;
import tn.spring.entity.reservation;
import tn.spring.service.LogementService;
import tn.spring.service.Reservationservice;

import java.util.List;

@RestController
@RequestMapping("api/v1/registartion/article")

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticleController {
    @Autowired
	LogementService articleService;
    @Autowired
	Reservationservice resService;

 

    @GetMapping("/all")
    public List<Logement> getAllArticles () {
        return articleService.findAllArticles();
    }
  
    @GetMapping("/find/{article_id}")
    public Logement getArticleById (@PathVariable("article_id") int article_id) {
        Logement article = articleService.findArticleById(article_id);
      return article;
    }

    @PostMapping("/add")
    public void addArticle(@RequestBody Logement article ) {
         articleService.addArticle(article); 
    }
    @PostMapping("/add/{ida}/{id}")
    public void res(@RequestBody reservation res ,@PathVariable("ida") int ida,@PathVariable("id") Long id ) {
         resService.add(res,ida,id); 
    }

    @PutMapping("/update/{id}")
    public void updateArticle(@RequestBody Logement article,@PathVariable("id") int id ) {
         articleService.updateArticle(article,id);
    }
    

    @DeleteMapping("/delete/{article_id}")
    public void deleteArticle(@PathVariable("article_id") int article_id) {
        articleService.deleteArticle(article_id);
    }
}

