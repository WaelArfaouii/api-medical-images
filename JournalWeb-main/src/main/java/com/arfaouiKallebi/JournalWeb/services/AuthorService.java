package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.AuthorDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> findAll() ;
    AuthorDTO findById(Long id) ;
    AuthorDTO deleteById(Long id) ;

    AuthorDTO save(AuthorDTO dto);
}
