package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.exception.EntityNotFoundException;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.ArticleRepository;
import com.arfaouiKallebi.JournalWeb.services.ArticleService;
import com.arfaouiKallebi.JournalWeb.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
//Logger
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository ;
    @Override
    public List<ArticleDTO> findAll() {

        return articleRepository.findAll().stream()
                .map(ArticleDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public ArticleDTO findById(Long id) {
        return articleRepository.findById(id)
                .map(ArticleDTO::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Any article found with id : " + id ,
                        ErrorCodes.ARTICLE_NOT_FOUND)
                );
    }

    @Override
    public ArticleDTO deleteById(Long id) {

        return ArticleDTO.fromEntity(articleRepository.deleteArticleById(id));
    }

    @Override
    public ArticleDTO save(ArticleDTO dto) {
        List<String> errors = ArticleValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Article is not valid {}", dto);
            throw new InvalidEntityException("Article is not valid ", ErrorCodes.ARTICLE_NOT_VALID, errors);
        }
        return ArticleDTO.fromEntity(
                articleRepository.save(
                        ArticleDTO.toEntity(dto)
                )
        );
    }

}
