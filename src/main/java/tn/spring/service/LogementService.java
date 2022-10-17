package tn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import tn.spring.entity.AppUser;
import tn.spring.entity.Logement; 
import tn.spring.exception.ArticleNotFoundException;
import tn.spring.repository.LogementRepository; 
import tn.spring.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class LogementService {
 

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
	UserRepository userRepository ;
    @Autowired
    private LogementRepository LR;

   


    public void addArticle(Logement article) {
    	
    	article.setImage(article.getImage().substring(12,article.getImage().length()));
         LR.save(article);
    }

    


    public List<Logement> findAllArticles(){
        return LR.findAll();
    }
   
    public Logement updateArticle(Logement article,int id) {
    Logement a=	LR.findById(id).get();
    a.setNbplace(article.getNbplace()); 

    a.setPlace(article.getPlace()); 

    a.setDate(article.getDate()); 

    a.setPrix(article.getPrix()); 
    a.setTitle(article.getTitle());
        return  LR.save(a);
    }

    public Logement findArticleById(int article_id){
        return LR.findById(article_id).get();}

    public void deleteArticle(int article_id){
        LR.deleteById(article_id);
    }
}
