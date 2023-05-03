package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;
import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;
import com.arfaouiKallebi.JournalWeb.services.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/editors")
public class EditorController {
    @Autowired
    private EditorService editorService ;
    @GetMapping
    public List<EditorDTO> getEditors(){
        return editorService.findAll() ;
    }
    @GetMapping("/{id}")
    public EditorDTO getEditorById(@PathVariable Long id){
        return editorService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public EditorDTO deleteEditorById(@PathVariable Long id){
        return editorService.deleteById(id);
    }
    @PostMapping("save")
    public EditorDTO saveEditor(@RequestBody EditorDTO editor){
        return editorService.save(editor) ;
    }
}
