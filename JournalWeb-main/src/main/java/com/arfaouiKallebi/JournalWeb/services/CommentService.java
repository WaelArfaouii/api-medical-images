package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> findAll() ;
    CommentDTO findById(Long id) ;
    CommentDTO deleteById(Long id) ;

    CommentDTO save(CommentDTO dto);
}
