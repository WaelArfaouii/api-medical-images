package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.dto.AuthorDTO;
import com.arfaouiKallebi.JournalWeb.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService ;
    @GetMapping
    public List<AuthorDTO> getAuthors(){
        return authorService.findAll();
    }
    @GetMapping("/{id}")
    public AuthorDTO getAuthorById(@PathVariable Long id){
        return authorService.findById(id);
    }
    @DeleteMapping("delete/{id}")
    public AuthorDTO deleteAuthorById(@PathVariable Long id){
        return authorService.deleteById(id);
    }
    @PostMapping("save")
    public AuthorDTO saveAuthor( @RequestBody AuthorDTO author){
        return authorService.save(author);
    }
}
