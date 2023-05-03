package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.dto.InvitationDTO;
import com.arfaouiKallebi.JournalWeb.dto.InvitationDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.InvitationRepository;
import com.arfaouiKallebi.JournalWeb.services.InvitationService;
import com.arfaouiKallebi.JournalWeb.validator.ArticleValidator;
import com.arfaouiKallebi.JournalWeb.validator.InvitationValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//Logger
@Slf4j
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationRepository invitationRepository ;
    @Override
    public List<InvitationDTO> findAll() {
        return null;
    }

    @Override
    public InvitationDTO findById(Long id) {
        return null;
    }

    @Override
    public InvitationDTO deleteById(Long id) {

        return InvitationDTO.fromEntity(invitationRepository.deleteInvitationById(id));
    }

    @Override
    public InvitationDTO save(InvitationDTO dto) {
        List<String> errors = InvitationValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Invitation is not valid {}", dto);
            throw new InvalidEntityException("Invitation is not valid ", ErrorCodes.ARTICLE_NOT_VALID, errors);
        }
        return InvitationDTO.fromEntity(
                invitationRepository.save(
                        InvitationDTO.toEntity(dto)
                )
        );
    }
}
