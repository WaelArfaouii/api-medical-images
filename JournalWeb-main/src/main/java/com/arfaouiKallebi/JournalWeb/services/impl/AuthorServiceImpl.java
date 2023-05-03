package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.dto.AuthorDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.AuthorRepository;
import com.arfaouiKallebi.JournalWeb.services.AuthorService;
import com.arfaouiKallebi.JournalWeb.validator.AuthorValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//Logger
@Slf4j
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository ;
    @Override
    public List<AuthorDTO> findAll() {
        return authorRepository.findAll().stream()
                .map(AuthorDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public AuthorDTO findById(Long id) {
        return null;
    }

    @Override
    public AuthorDTO deleteById(Long id) {

        return AuthorDTO.fromEntity(authorRepository.deleteAuthorById(id));
    }

    @Override
    public AuthorDTO save(AuthorDTO dto) {
        List<String> errors = AuthorValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Author is not valid {}", dto);
            throw new InvalidEntityException("Author is not valid", ErrorCodes.USER_NOT_VALID, errors);
        }
        return AuthorDTO.fromEntity(
                authorRepository.save(
                        AuthorDTO.toEntity(dto)
                )
        );
    }
}
