package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;

import java.util.List;

public interface ReviewerService {
    List<ReviewerDTO> findAll() ;
    ReviewerDTO findById(Long id) ;
    ReviewerDTO deleteById(Long id) ;
    ReviewerDTO save(ReviewerDTO dto);


}
