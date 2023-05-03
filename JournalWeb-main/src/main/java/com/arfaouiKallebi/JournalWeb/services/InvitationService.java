package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.dto.InvitationDTO;

import java.util.List;

public interface InvitationService {
    List<InvitationDTO> findAll() ;
    InvitationDTO findById(Long id) ;
    InvitationDTO deleteById(Long id) ;

    InvitationDTO save(InvitationDTO dto);
}
