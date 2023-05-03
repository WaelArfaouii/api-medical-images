package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;

import java.util.List;

public interface EditorService {
    List<EditorDTO> findAll() ;
    EditorDTO findById(Long id) ;
    EditorDTO deleteById(Long id) ;

    EditorDTO save(EditorDTO dto);
}
