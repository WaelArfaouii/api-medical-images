package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.ItemDTO;
import com.arfaouiKallebi.JournalWeb.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController {
    @Autowired
    private ItemService itemService ;
    @GetMapping
    public List<ItemDTO> getItems(){
        return itemService.findAll() ;
    }
    @GetMapping("/{id}")
    public ItemDTO getItemById(@PathVariable Long id){
        return itemService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public ItemDTO deleteItemById(@PathVariable Long id){
        return itemService.deleteById(id);
    }
    @PostMapping("save")
    public List<ItemDTO> saveItem(@RequestBody List<ItemDTO> items){
        return itemService.save(items); }
}
