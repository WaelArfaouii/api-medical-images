package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;
import com.arfaouiKallebi.JournalWeb.services.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reviewers")
public class ReviewerController {
    @Autowired
    private ReviewerService reviewerService ;
    @GetMapping
    public List<ReviewerDTO> getReviewers(){
        return reviewerService.findAll() ;
    }
    @GetMapping("/{id}")
    public ReviewerDTO getReviewerById(@PathVariable Long id){
        return reviewerService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public ReviewerDTO deleteReviewerById(@PathVariable Long id){
        return reviewerService.deleteById(id);
    }
    @PostMapping("save")
    public ReviewerDTO saveReviewer(@RequestBody ReviewerDTO reviewer){
        return reviewerService.save(reviewer) ;
    }
}
