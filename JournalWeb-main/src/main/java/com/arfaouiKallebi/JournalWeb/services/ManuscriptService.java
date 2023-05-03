package com.arfaouiKallebi.JournalWeb.services;


import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import java.util.List;

public interface ManuscriptService {
    List<ManuscriptDTO> findAll() ;
    ManuscriptDTO findById(Long id) ;
    ManuscriptDTO deleteById(Long id) ;

    ManuscriptDTO save(ManuscriptDTO dto);

    List<ManuscriptDTO> getProcessedManuscripts();

    List<ManuscriptDTO> getSentBackManuscripts();

    List<ManuscriptDTO> getIncompleteManuscripts();

    List<ManuscriptDTO> getWaitingManuscripts();
}
