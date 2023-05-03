package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.AuthorDTO;
import com.arfaouiKallebi.JournalWeb.dto.CommentDTO;
import com.arfaouiKallebi.JournalWeb.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService ;
    @GetMapping
    public List<CommentDTO> getComments(){
        return commentService.findAll() ;
    }
    @GetMapping("/{id}")
    public CommentDTO getCommentById(@PathVariable Long id){
        return commentService.findById(id);
    }
    @DeleteMapping("delete/{id}")
    public CommentDTO deleteCommentById(@PathVariable Long id){
        return commentService.deleteById(id);
    }
    @PostMapping("save")
    public CommentDTO saveComment(@RequestBody CommentDTO comment){
        return commentService.save(comment) ;
    }
}
