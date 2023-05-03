package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService ;
    @GetMapping
    public List<ArticleDTO> getArticles(){
        return articleService.findAll() ;
    }
    @GetMapping("/{id}")
    public ArticleDTO getArticleById(@PathVariable Long id){
        return articleService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public ArticleDTO deleteArticleById(@PathVariable Long id){
        return articleService.deleteById(id);
    }
    @PostMapping("save")
    public ArticleDTO saveArticle(@RequestBody ArticleDTO art){
        return articleService.save(art) ;
    }
}
