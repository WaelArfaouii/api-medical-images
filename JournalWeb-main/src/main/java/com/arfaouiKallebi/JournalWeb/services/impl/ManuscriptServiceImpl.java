package com.arfaouiKallebi.JournalWeb.services.impl;
import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.ManuscriptRepository;
import com.arfaouiKallebi.JournalWeb.services.ManuscriptService;
import com.arfaouiKallebi.JournalWeb.validator.ManuscriptValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ManuscriptServiceImpl implements ManuscriptService {
    @Autowired
    private ManuscriptRepository   manuscriptRepository ;
    @Override
    public List<ManuscriptDTO> findAll() {
        return null;
    }

    @Override
    public ManuscriptDTO findById(Long id) {
        return null;
    }

    @Override
    public ManuscriptDTO deleteById(Long id) {

        return ManuscriptDTO.fromEntity(manuscriptRepository.deleteManuscriptById(id));
    }

    @Override
    public ManuscriptDTO save(ManuscriptDTO dto) {
        List<String> errors = ManuscriptValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Manuscript is not valid {}", dto);
            throw new InvalidEntityException("Manuscript is not valid ", ErrorCodes.MANUSCRIPT_NOT_VALID, errors);
        }
        return ManuscriptDTO.fromEntity(
                manuscriptRepository.save(
                        ManuscriptDTO.toEntity(dto)
                )
        );
    }

    @Override
    public List<ManuscriptDTO> getProcessedManuscripts() {
        return manuscriptRepository.getProcessedManuscripts().stream()
                .map(ManuscriptDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ManuscriptDTO> getSentBackManuscripts() {
        return manuscriptRepository.getSentBackManuscripts().stream()
                .map(ManuscriptDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ManuscriptDTO> getIncompleteManuscripts() {
       return manuscriptRepository.getIncompleteManuscripts().stream()
                .map(ManuscriptDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ManuscriptDTO> getWaitingManuscripts() {
        return manuscriptRepository.getWaitingManuscripts().stream()
                .map(ManuscriptDTO::fromEntity)
                .collect(Collectors.toList());
    }
}
