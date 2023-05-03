package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    List<ItemDTO> findAll() ;
    ItemDTO findById(Long id) ;
    ItemDTO deleteById(Long id) ;

    List<ItemDTO> save(List<ItemDTO> dtos);
}
