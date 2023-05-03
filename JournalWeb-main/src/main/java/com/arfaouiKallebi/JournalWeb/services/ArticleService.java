package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {
    List<ArticleDTO> findAll() ;
    ArticleDTO findById(Long id) ;
    ArticleDTO deleteById(Long id) ;

    ArticleDTO save(ArticleDTO dto);

}
