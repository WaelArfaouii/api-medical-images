package com.arfaouiKallebi.JournalWeb.controller.api;
import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import com.arfaouiKallebi.JournalWeb.services.ManuscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/manuscript")
public class ManuscriptController {
    @Autowired
    private ManuscriptService manuscriptService ;
    @GetMapping
    public List<ManuscriptDTO> getManuscripts(){
        return manuscriptService.findAll() ;
    }
    @GetMapping("/{id}")
    public ManuscriptDTO getManuscriptById(@PathVariable Long id){
        return manuscriptService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public ManuscriptDTO deleteManuscriptById(@PathVariable Long id){
        return manuscriptService.deleteById(id);
    }
    @PostMapping("save")
    public ManuscriptDTO saveManuscript(@RequestBody ManuscriptDTO manuscript){
        return manuscriptService.save(manuscript);
    }
    @GetMapping("processed")
    public List<ManuscriptDTO> getProcessedManuscripts(){
        return manuscriptService.getProcessedManuscripts();
    }
    @GetMapping("sentBack")
    public List<ManuscriptDTO> getSentBackManuscripts(){
        return manuscriptService.getSentBackManuscripts();
    }
    @GetMapping("incomplete")
    public List<ManuscriptDTO> getIncompleteManuscripts(){
        return manuscriptService.getIncompleteManuscripts();
    }
    @GetMapping("waiting")
    public List<ManuscriptDTO> getWaitingManuscripts(){
        return manuscriptService.getWaitingManuscripts();
    }
}
